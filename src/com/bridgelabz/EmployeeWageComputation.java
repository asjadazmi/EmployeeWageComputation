package com.bridgelabz;


public class EmployeeWageComputation {
	public static final int IS_PART_TIME=2;
	public static final int IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HRS=20;
	public static final int NUM_OF_WORKING_DAYS=5;
	public static final int MAX_HRS_IN_MONTH=12;
	public static void main(String args[]) {
		int totalworkingdays=0;
		int emphrs=0,totalemphrs=0;
		while(totalemphrs<=MAX_HRS_IN_MONTH&&totalworkingdays<NUM_OF_WORKING_DAYS) {
			int empcheck=(int)Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			   case IS_PART_TIME:
				   emphrs=4;
				   break;
			   case IS_FULL_TIME:
				   emphrs=8;
				   break;
			   default:
				   emphrs=0;
				   
			}
			totalemphrs+=emphrs;
			System.out.println("day: "+totalworkingdays+" emphr s"+emphrs);
			
		}
		int totalempwage=totalemphrs*EMP_RATE_PER_HRS;
		System.out.println("total emp wage"+totalempwage);
		
	}
	
	
}
	
