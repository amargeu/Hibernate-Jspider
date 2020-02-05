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
	  /*  Student	s1=session.get(Student.class, 1);
	   System.out.println(s1);*/
		
		//QUERY WITHOUT ALIAS
		org.hibernate.query.Query<Student>query= session.createQuery("from Student where age=25");
	   	
		//Object student=query.uniqueResult();///uniqueResult() select one row at a time
		List<Student>list=query.list();// list() returns multiple record 
		for (Student s : list) 
		{
			System.out.println(s);
		}
		
		
		//QUERY WITH ALIAS
		/*org.hibernate.query.Query<Student>query1= session.createQuery(" Select stu from Student stu where name='Aarati'");
	   	
		Student student =query1.uniqueResult();
		System.out.println(student);*/
		
	}

}
