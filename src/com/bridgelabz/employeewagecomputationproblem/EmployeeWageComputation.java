package com.bridgelabz.employeewagecomputationproblem;

/*Calculating Wages for a Month assuming 20
  Working Days in a Month */
 
public class EmployeeWageComputation {
	
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	public static final int emp_rate_per_hour = 20;
	public static final int num_of_working_days = 2;

	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation Program!");
		
		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		
		for(int day = 0; day < num_of_working_days ; day++) {
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch(empCheck) {
		case is_part_time:
			empHrs = 4;
			break;
		case is_full_time:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * emp_rate_per_hour;
		totalEmpWage += empWage;
		System.out.println("Emp Wage: " + empWage);
	}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}

