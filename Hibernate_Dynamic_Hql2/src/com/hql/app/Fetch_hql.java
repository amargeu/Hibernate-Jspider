package com.hql.app;

import java.util.Arrays;
import java.util.List;

public class Fetch_hql
{
	public static void main(String[] args)
	{
		StudentDao dao = new StudentDao();
	  /*  StudentDto studentDto = dao.findByName("Kshitij joshi");
		System.out.println(studentDto);
		
		Object[] studentDto1 = dao.findAgeAndPercenategByName("salman");
		System.out.println(Arrays.toString(studentDto1));
		
	   List<StudentDto>studentDto2 =dao.findAllByAgeGreaterThan(20);
	   for (StudentDto obj : studentDto2) {
		   System.out.println(obj);
	   }*/

	   List<Object[]> data = dao.findStreamAndPercenategAndNameByAgeLessThan(25);
	   
	   for (Object[] objects : data) {
		System.out.println(Arrays.toString(objects));
	   }
	   
	  /* float studentDto3=dao.findPercenategeByName("salman");
			System.out.println(studentDto3);*/
	   
	   }
	  
 
}
