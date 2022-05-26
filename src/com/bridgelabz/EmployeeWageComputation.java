package com.bridgelabz;
import java.util.Random.*;
public class EmployeeWageComputation {
	public static void main(String args[]) {
		System.out.println("welcome to Employee wage computation program");
		int is_Full_time=1;
		double empCheck=Math.floor(Math.random()*10)%10;
		System.out.println(empCheck);
		if(empCheck==is_Full_time) {
			System.out.println("employee is present");
		}else {
			System.out.println("Employee is abscent");
		}
		
	}

}
