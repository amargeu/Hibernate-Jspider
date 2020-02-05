package com.oneTomany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.app.HibernateUtil;

public class Runner
{
	public static void main(String[] args) 
	{
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		
	       Father rama=new Father();
	       rama.setName("Ram");
	       
	       Children lav=new Children();
	       lav.setName("Lav");
	       lav.setGender('M');
	      
	       Children kush=new Children();
	       kush.setName("Kush");
	       kush.setGender('M');
	       ///1 st way
	      /* List<Children>list=new ArrayList<Children>();
	       list.add(lav);
	       list.add(kush);*/
	       
	       //2nd way to create list
	       List<Children>childlist=Arrays.asList(lav,kush);
	     
	       //define relationship  
	       
	       rama.setListOfChildren(childlist);
	       lav.setFather(rama);
	       kush.setFather(rama);
	      
	       Session session=factory.openSession();
	       Transaction tr=session.beginTransaction();
	       session.save(rama);
	       session.save(lav);
	       session.save(kush);
	       
	       tr.commit();
	       session.close();
	       factory.close();
		
	}

}
