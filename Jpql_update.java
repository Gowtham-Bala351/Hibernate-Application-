package hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Jpql_update {

	public static void main(String[] args) 
	{
		
    EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
    EntityManager manager=factory.createEntityManager();
    EntityTransaction transaction=manager.getTransaction();
    transaction.begin();
    Query q=manager.createQuery("update User u set u.address='pondycherry' where u.id='0'");
    
    q.executeUpdate();
    transaction.commit();
	}

}
