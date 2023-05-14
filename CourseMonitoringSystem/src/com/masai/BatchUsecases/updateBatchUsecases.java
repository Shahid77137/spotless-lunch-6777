package com.masai.BatchUsecases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.BatchException;

public class updateBatchUsecases {
// by selecting this operation we can update the crud operation
//	we can update a particular batch with another batch by its id and its name
	public static void main(String[] args) {
		System.out.println("Enter Name To Update Batch");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 Scanner sc=new Scanner(System.in); 
		 System.out.println("Enter batch name to Update Batch");
		String BatchName=sc.next();
		 System.out.println("Enter batchId to Update batch");
		 int batchIdId=sc.nextInt();
		 
		 AdminDao dao=new AdminDaoImpl();
		 try {
			String res=dao.updateBatch(batchIdId, BatchName);
			System.out.println(res);
		} catch (BatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
