package hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteValues {

	public static void main(String[] args) 
	{
		 EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		 EntityManager manager=factory.createEntityManager();
		 
		 EntityTransaction transaction=manager.getTransaction();
		 User u=manager.find(User.class, 0);
		 if(u!=null)
		 {
			 transaction.begin();
			 manager.remove(u);
			 transaction.commit();
			 
		 }
		 else
		 {
			 System.out.println("id is not found");
		 }

	}

}
