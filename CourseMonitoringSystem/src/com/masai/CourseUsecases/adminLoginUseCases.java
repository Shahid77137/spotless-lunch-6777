package com.masai.CourseUsecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Admin;

public class adminLoginUseCases {
// By selecting this option Admin can login to the system by putting username and password
	public static boolean login() {
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Admin Username");
		String uername=sc.next();
		System.out.println("Enter Admin Password");
		String password=sc.next();
		
		try {
			AdminDao dao=new AdminDaoImpl();
			Admin admin=dao.loginAdmin(uername, password);
			flag=true;
			System.out.println("Welcome: Admin");
		} catch (AdminException e) {
			System.out.println(e.getMessage());
		}
		return flag;
		
	}

}
