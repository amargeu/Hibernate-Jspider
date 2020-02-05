package com.hql.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import singleton.app.HibernateUtil;

public class Fetch_Hql 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		Session session=factory.openSession();
	 
		
		
		org.hibernate.query.Query<Student>query= session.createQuery("from Student where age>=? or stream=?");
		query.setParameter(0, 25);///set placeholder
		query.setParameter(1,"CSE");
	
		List<Student>list=query.list();// list() returns multiple record 
		for (Student s : list) 
		{
			System.out.println(s);
		}
	
	}

}
