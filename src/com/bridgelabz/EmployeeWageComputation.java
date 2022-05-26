package com.bridgelabz;
// solving using case statement

public class EmployeeWageComputation {
	public static final int is_Full_Time=1;
	public static final int Is_Part_Time=2;
	public static final int Emp_Rate_Per_Hrs=20;
	public static void main(String args[]){
		int emphrs=0;
		int totalemphrs=0;
		int empwage=0;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch (empCheck){
		     case
		        is_Full_Time:
			    emphrs=8;
			 break;
		     case Is_Part_Time:
		    	 emphrs=4;
		    	 break;
		     default:
		    	 emphrs=0;
		    	 }
		totalemphrs+=emphrs;
		int totalempwage=Emp_Rate_Per_Hrs*emphrs;
		System.out.println("total hrs: "+totalemphrs+" totalempwage "+totalempwage);
	}
	
	}
	
