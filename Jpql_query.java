package hibernate_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Jpql_query {

	public static void main(String[] args) 
	{
		
      EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
      
      EntityManager manager=factory.createEntityManager();
      Query q=manager.createQuery("select u from User u");
      List<User> list= q.getResultList();
      for(User u:list)
      {
    	  System.out.println(u.getId()+" "+u.getName()+" "+u.getAddress());
      }
	}

}


