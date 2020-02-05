package com.onetoone.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import singleton.app.HibernateUtil;


public class Runner 
{
	public static void main(String[] args)
	{
		SessionFactory factory= HibernateUtil.buildSessionFactory();
		
		Student a=new Student();
		a.setName("SOUMEN");
		a.setBranch("EEE");
	
		
		
		Laptop dell=new Laptop();
		dell.setBrand("DELL");
		dell.setModel("XPS 07");
		
		dell.setStudent(a);//responsible for insert  Fk in database
		a.setLaptop(dell);
		
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(dell);
		session.save(a);
		
		tr.commit();
		session.close();
		
        factory.close();
		
		
		
	}

}
