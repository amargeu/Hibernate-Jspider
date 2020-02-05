package com.oneTomany.app;



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
		
		  Product shooes=new Product();
	       shooes.setProd_name("NIKE");
	       shooes.setProd_price(3500);
	       
	       Review r1=new Review();
	       r1.setName("rohit");
	       r1.setComment("good...");
	      
	      Review r2=new Review();
	      r2.setName("soumen");
	      r2.setComment("very good");
	      
	       ///1 st way
	      /* List<Children>list=new ArrayList<Children>();
	       list.add(lav);
	       list.add(kush);*/
	       
	       //2nd way to create list
	       List<Review>rev_list=Arrays.asList(r1,r2);
	     
	       //define relationship  
	       
	       shooes.setListOfreview(rev_list);
	       r1.setProduct(shooes);
	       r2.setProduct(shooes);
	      
	       Session session=factory.openSession();
	       Transaction tr=session.beginTransaction();
	       session.save(shooes);
	       session.save(r1);
	       session.save(r2);
	       
	       tr.commit();
	       session.close();
	       factory.close();
	       
	        
	       
	       
	       
	       
	
		
	}

}
