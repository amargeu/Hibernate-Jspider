package com.hql.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernateUtil;

public class Runner 
{
	public static void main(String[] args)
	{
	SessionFactory	factory=HibernateUtil.buildSessionFactory();
	Session session= factory.openSession();
	Transaction tr=session.beginTransaction();
	
	StudentDto kj=new StudentDto();
	kj.setName("Kshitij joshi");
	kj.setPercentage(75.6f);
	kj.setAge(24);
	kj.setStream("ECE");
	
	StudentDto Ashok=new StudentDto();
	Ashok.setName("Ashok");
	Ashok.setPercentage(66.6f);
	Ashok.setAge(25);
	Ashok.setStream("ECE");
	
	StudentDto Suraj=new StudentDto();
	Suraj.setName("Suraj");
	Suraj.setPercentage(75.6f);
	Suraj.setAge(25);
	Suraj.setStream("CSE");
	
	StudentDto Arati=new StudentDto();
	Arati.setName("Aarati");
	Arati.setPercentage(79.6f);
	Arati.setAge(23);
	Arati.setStream("ME");
	
	StudentDto Salman=new StudentDto();
	Salman.setName("Salman");
	Salman.setPercentage(89.6f);
	Salman.setAge(50);
	Salman.setStream("ME");
	
	session.save(Salman);
	session.save(Arati);
	session.save(Suraj);
	session.save(Ashok);
	session.save(kj);
	
	tr.commit();
	factory.close();
	
	}

}
