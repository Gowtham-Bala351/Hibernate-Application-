package hibernate_demo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDriver
{
	public static void main(String[] args) 
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		System.out.println(factory);
	}

}