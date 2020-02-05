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
		
		Product prod=session.get(Product.class, new Long(1));
		 System.out.println(prod);
		 
		/* Review rev=session.get(Review.class, new Long(1));
		 System.out.println(rev);*/
		
	  session.close();
	  factory.close();
		
		
	}

}
