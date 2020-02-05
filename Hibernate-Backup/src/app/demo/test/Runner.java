package app.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner 
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
     	
     	//transaction is set to autocommite false in hibernate
     	//so to manupulate DATA in Db we will create a transaction
     	//only for DML queries
     	Transaction tr=session.beginTransaction();
     	
     	Food jalabi=new Food();
     	
     	jalabi.setFoodId(1);
     	jalabi.setFoodForm("bihar");
     	jalabi.setName("litti");
     	jalabi.setFamousFor("famous");
     	
     	session.save(jalabi);
     	//use to manupulate data base
     	tr.commit();
     	
     	//close resources
     	
     	sf.close();
    	
		
	}

}
