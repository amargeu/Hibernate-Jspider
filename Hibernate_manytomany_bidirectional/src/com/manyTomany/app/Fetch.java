package com.manyTomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;



import singleton.app.HibernateUtil;

public class Fetch 
{
	public static void main(String[] args)
	{
        SessionFactory factory=HibernateUtil.buildSessionFactory();
		
		Session session=factory.openSession();
		
		/* Teacher teacher=session.get(Teacher.class, new Integer(1));
		 System.out.println(teacher);*/
		 
	 Student student=session.get(Student.class, new Integer(1));
		 System.out.println(student);
		
	  session.close();
	  factory.close();
		
	}

}
