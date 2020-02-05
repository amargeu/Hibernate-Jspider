package com.hql.app;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import singleton.app.HibernateUtil;

// persiatnce logic has to writen in this class
public class StudentDao
{
	private SessionFactory factory = HibernateUtil.buildSessionFactory();

	/*public StudentDto findByName(String name) 
	{
		// you have too fill the code using hql

		Session session = factory.openSession();
		Query<StudentDto> query = session.createQuery("from StudentDto where name = :n");
		query.setParameter("n", name);
		StudentDto studentDto = query.uniqueResult();
		session.close();

		return studentDto;
	}*/
//try with resources
/* public StudentDto findByName(String name) 
	{
	 StudentDto studentDto=null;
		try(Session session = factory.openSession()){
		Query<StudentDto> query = session.createQuery("from StudentDto where name = :n");
		query.setParameter("n", name);
		 studentDto = query.uniqueResult();
		session.close();
		}
		catch (Exception e) 
		{
			
		}

		return studentDto;
	}
 
	Object[] findAgeAndPercenategByName(String name)
	{
	      Object[] data=null;
	      try(Session session = factory.openSession()){
	    	  Query <Object[]>query = session.createQuery(" select age,percentage from StudentDto where name = :n");
	  		query.setParameter("n", name);
	  		 data=query.uniqueResult(); 
	      }
	      catch (Exception e) {
	e.printStackTrace();
		}
	     
		return data;
	}

	List<StudentDto> findAllByAgeGreaterThan(int age)
	{
		List<StudentDto>list=null;
		try(Session session = factory.openSession()){
			
		Query<StudentDto> query = session.createQuery("from StudentDto where age > :age");
		query.setParameter("age", age);
	     list=query.list();// list() returns multiple record 
		}
		catch (Exception e) {
			
		}
	return list;
	}
	float findPercenategeByName(String name)
	{
		float studentDto=0;
		try(Session session = factory.openSession()){
			Query query = session.createQuery(" select percentage from StudentDto where  name=:n");
			query.setParameter("n", name);
	        studentDto =  (float) query.uniqueResult();
		}
		
		return  studentDto;
	}*/
	

	List<Object[]> findStreamAndPercenategAndNameByAgeLessThan(int age)
	{
		List<Object[]> list=null;
		try(Session session = factory.openSession()){
			
		Query query = session.createQuery(" select name,stream,percentage from StudentDto where  age<:age");
		query.setParameter("age", age);
		list= query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}






