package com.masai.BatchUsecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.BatchException;

public class deleteBatchUseCase {
// Here user can select this option can perform delete crud operation by batch name... 
	public static void main(String[] args) {
		System.out.println("Enter Name To Delete Batch");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Scanner sc=new Scanner(System.in);      
		 AdminDao dao=new AdminDaoImpl();
		 while(true) {
			 System.out.println("Enter name of Batch");
				String name=sc.next();
				try {
					String result=dao.deleteBatchByName(name);
					System.out.println(result);
				} catch (BatchException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Do You want to Delete More Batch?(Y/N)");
				String res=sc.next();
				if(res.equalsIgnoreCase("N")) {
					System.out.println("Your Batch is deleted");
					break;
				}
				
		 }

	}

}
