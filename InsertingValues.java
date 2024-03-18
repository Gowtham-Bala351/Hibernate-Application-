package hibernate_demo;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertingValues 
{
    public static void main(String[] args) 
    {
    	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
    	
//    	all entities will be present in ENTITYMANAGERFACTORY..in this EntityMnager interface is present manage all the entities present in factory.
    	
    	EntityManager manager=factory.createEntityManager(); 
    	
//    	when ever database get effected by operations then we have to create entity transaction to manage the transaction
    	
    	EntityTransaction transaction=manager.getTransaction();
    	
    	User u=new User();
    	u.setName("suresh");
    	u.setAddress("banglore");
    	
    	u.setName("gowtham");
    	u.setAddress("australia");
    
    	
    	
     	transaction.begin(); 
     	
//     	persist() is given by EntityManager Interface
     	manager.persist(u);
     	transaction.commit();
     	
    	
	}
}
