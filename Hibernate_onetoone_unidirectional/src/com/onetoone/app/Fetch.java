package com.onetoone.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



import singleton.app.HibernateUtil;

public class Fetch 
{
	public static void main(String[] args) 
	{
		
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		
		Session session = factory.openSession();
	
		// Student s1=session.get(Student.class, 1);
Laptop l1=session.get(Laptop.class,new Integer(1));
	//System.out.println(s1);
	System.out.println(l1);
	session.close();
	//factory.close();
	}
	

}
