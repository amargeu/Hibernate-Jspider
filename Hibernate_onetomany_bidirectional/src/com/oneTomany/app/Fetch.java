package com.oneTomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import singleton.app.HibernateUtil;

public class Fetch 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		
		Session session=factory.openSession();
		
		 Father father=session.get(Father.class, new Long(1));
		 System.out.println(father);
		 
		/* Children children=session.get(Children.class, new Long(1));
		 System.out.println(children);*/
		
	  session.close();
	  factory.close();
		
		
	}

}
