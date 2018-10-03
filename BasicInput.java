package org.kp.input;

import java.util.Scanner;

public class BasicInput {

	public static void main(String[] args) {
		int empId;
		String empName;
		float empSal;
	    
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the employe name");
	    empName=s.nextLine();
	    System.out.println("Employee Name :"+empName);
	    
	    System.out.println("Please enter the employee Id");
	    empId= s.nextInt();
	    System.out.println("Employee Id : "+empId);
	      
	    
	    
	    System.out.println("Enter employee salary");
	    empSal=s.nextFloat();
	    System.out.println("Employee Salary : "+empSal);
	   System.exit(0);
	}

}

