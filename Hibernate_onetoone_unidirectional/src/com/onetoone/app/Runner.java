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
		a.setName("AMAR");
		a.setBranch("ECE");
		a.setRollNo(2008);
		
		Laptop HP=new Laptop();
		HP.setBrand("HP");
		HP.setModel("XPS 07");
		
		a.setLaptop(HP);//responsible for insert  Fk in database
		
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(HP);
		session.save(a);
		
		tr.commit();
		session.close();
		
        factory.close();
		
		
		
	}

}
