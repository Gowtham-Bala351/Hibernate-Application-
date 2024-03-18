package hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateValues {

	public static void main(String[] args) 
	{
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		 EntityManager manager=factory.createEntityManager();
		 
		 EntityTransaction transaction=manager.getTransaction();
		 User u=manager.find(User.class, 0);
		 if(u!=null)
		 {
			 transaction.begin();
			 u.setAddress("Us");
			 manager.merge(u);
//			 set() will perform changes only on java so to perform Updation on database we use merge()..
			 transaction.commit();
		 }
		 else
		 {
			 System.out.println("id is not found");
		 }

	}

}
