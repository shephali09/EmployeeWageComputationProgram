package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		int is_full_time=1;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == is_full_time) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
