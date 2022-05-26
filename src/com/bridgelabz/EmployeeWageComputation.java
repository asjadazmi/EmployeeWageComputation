package com.bridgelabz;

public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("welcome to Employee wage computation program");
		int is_Full_time=1;
		int is_Part_Time=2;
		int Emp_Rate_Per_Hour=20;
		int emphrs=0;
		int empwage=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if(empCheck==is_Full_time) {
			System.out.println("Employee is present full time");
			emphrs=8;
			}
		else if(empCheck==2) {
			System.out.println("Employee is present part time");
			emphrs=4;
		}
		else 
			{
				System.out.println("Employee is absent");
				emphrs=0;
			}
		empwage=emphrs*Emp_Rate_Per_Hour;
		System.out.println("empwage: "+empwage);
	}

}
