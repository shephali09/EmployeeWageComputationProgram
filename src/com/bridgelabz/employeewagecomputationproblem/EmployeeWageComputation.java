package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		int is_full_time=1;
		int emp_rate_per_hour = 20;
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == is_full_time) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = empHrs * emp_rate_per_hour;
		System.out.println("Emp Wage: " + empWage);
	}
}
