package app.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetch 
{
	public static void main(String[] args)
	{
		//will read hibernate.cfg.xml file from src folder directly
		Configuration cfg=new Configuration();
		cfg.configure();
		
		System.out.println("config done");
		
		//20 db connection will create u SessionFactory
     	SessionFactory sf=cfg.buildSessionFactory();
     	System.out.println("connection established with db");
     	
     	
     	//uses 1 connection and JDBC statement to perform CRUD
     	Session session=sf.openSession();
     	
     	Food food =session.get(Food.class, 1);
     			System.out.println(food);
     	
     	//close resources
     	session.close();
     	sf.close();
    	
		
	}

}
