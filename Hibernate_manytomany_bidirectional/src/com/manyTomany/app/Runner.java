package com.manyTomany.app;

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
		//build factory
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tr=session.beginTransaction();
		
		//create object
		Teacher shishra=new Teacher();
		shishra.setName("Shishra");
		shishra.setTeachessubject("JAVA");
		
	   Teacher vivek=new Teacher();
	   vivek.setName("Vivek");
	   vivek.setTeachessubject("JAVA");
	   
	   Teacher nagesh=new Teacher();
	   nagesh.setName("Nagesh");
	   nagesh.setTeachessubject("SQL");
		
	   Teacher nikhila=new Teacher();
	   nikhila.setName("Nikhila");
	   nikhila.setTeachessubject("SQL");
		
		Student ashok=new Student();
		ashok.setName("Ashok");
		ashok.setGender('M');
		
		Student gopi=new Student();
		gopi.setName("Gopi");
		gopi.setGender('M');
		
		Student kishan=new Student();
		kishan.setName("Kishan");
		kishan.setGender('M');
		
		Student satya=new Student();
		satya.setName("Satya");
		satya.setGender('M');
		
		Student suraj=new Student();
		suraj.setName("Suraj");
		suraj.setGender('M');
		//list of STudent
		  List<Student>StudentlistOfShishra=Arrays.asList(ashok,gopi,satya);
		  List<Student>StudentlistOfVivek=Arrays.asList(kishan);
		  List<Student>StudentlistOfNagesh=Arrays.asList(ashok,gopi,kishan);
		  List<Student>StudentlistOfNikhila=Arrays.asList(satya,suraj);
		  
		  //list of teacher
		  List<Teacher>teacherlistOfAshok=Arrays.asList(shishra,nagesh);  
		  List<Teacher>teacherlistOfGopi=Arrays.asList(shishra,nagesh);  
		  List<Teacher>teacherlistOfKishan=Arrays.asList(vivek,nagesh);  
		  List<Teacher>teacherlistOfSatya=Arrays.asList(shishra,nikhila); 
		  List<Teacher>teacherlistOfSuraj=Arrays.asList(nikhila);  
		 //define relationship
		  shishra.setStudent(StudentlistOfShishra);
		  vivek.setStudent(StudentlistOfVivek);
		  nagesh.setStudent(StudentlistOfNagesh);
		  nikhila.setStudent(StudentlistOfNikhila);
		  
		  ashok.setTeacher(teacherlistOfAshok);
		  gopi.setTeacher(teacherlistOfGopi);
		  kishan.setTeacher(teacherlistOfKishan);
		  satya.setTeacher(teacherlistOfSatya);
		  suraj.setTeacher(teacherlistOfSuraj);
		 
		  session.save(shishra);
		  session.save(vivek);
		  session.save(nagesh);
		  session.save(nikhila);
		  
		  session.save(ashok);
		  session.save(gopi);
		  session.save(suraj);
		  session.save(satya);
		  session.save(kishan);
		  
	    tr.commit();
		session.close();
		factory.close();
		
		  
		

		}

}
