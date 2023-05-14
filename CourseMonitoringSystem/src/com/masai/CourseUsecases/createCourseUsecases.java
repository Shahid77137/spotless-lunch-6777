package com.masai.CourseUsecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.CourseException;
import com.masai.model.Course;

public class createCourseUsecases {
	// By selection this operation only admin can perform create crud operation
	// Here we can create/add a new course by putting details
	public static void main(String[] args) {
		System.out.println("Enter course Details ");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace( );
		}
       Scanner sc=new Scanner(System.in);      
		
		AdminDao dao=new AdminDaoImpl();
		while(true) {
			System.out.print("Enter name of Course ");
			String name=sc.next();
			System.out.print("Enter Fee Amount  of Course ");
			int fees=sc.nextInt();
			System.out.print("Enter Description of Course ");
			String desc=sc.next();
			Course courses=new Course();
			courses.setCname(name);
			courses.setFee(fees);
			courses.setDescription(desc);
			
			try {
				String res=dao.createCourse(courses);
				System.out.println(res);
			} catch (CourseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Do You want to Register More Courses?(Y/N) ");
			String res=sc.next();
			if(res.equalsIgnoreCase("N")) {
				System.out.print("Thank You for course Registration ");
				break;
			}
			
		}

	}

}

