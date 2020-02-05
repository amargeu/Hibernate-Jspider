package com.hql.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import singleton.app.HibernateUtil;

public class Fetch_Hql_name_holder 
{
	public static void main(String[] args) 
	{
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		Session session=factory.openSession();
	 
		
		//name holder place of place holder
	Query<Student>query= session.createQuery("from Student where age=:age and stream=:stream  ");
	query.setParameter("age", 25);///set placeholder
	query.setParameter("stream","CSE");
	
	List<Student>list=query.list();// list() returns multiple record 
		for (Student s : list) 
	{
			System.out.println(s);
	}
     /*	Query<Object []> query = session.createQuery("select age , name from Student where name = :name");
        query.setParameter("name", "Kshitij Joshi");
    
    Object[] objectData = query.uniqueResult();
    
    System.out.println(Arrays.toString(objectData));*/



    /*  Query<Object[]> query = 
     	session.createQuery("select age , name from Student where age > :age");
         query.setParameter("age", 24);
       
        List<Object[]> list = query.list();
         
        for (Object[] objects : list) 
        	System.out.println(Arrays.toString(objects));*/


       /*    Query<Integer> query = 
		session.createQuery("select age  from Student where name = :name");
         query.setParameter("name", "Kshitij Joshi");

         int data = query.uniqueResult();

	    System.out.println(data);*/

	}

}
