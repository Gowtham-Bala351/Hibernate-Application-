package hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DisplayData {

	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		
		EntityManager manager=factory.createEntityManager();
		User u=manager.find(User.class, 0);
		if(u!=null)
		{
			System.out.println(u.getId());
			System.out.println(u.getName());
			System.out.println(u.getAddress());
		}
		else
		{
			System.out.println("Id is not found");
		}

	}

}
