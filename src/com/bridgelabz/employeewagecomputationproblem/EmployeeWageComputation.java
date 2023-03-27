package com.bridgelabz.employeewagecomputationproblem;

/*Calculate Wages till a condition of total
working hours or days is reached for
a month - Assume 100 hours and 20 days
Refactor the Code to write a Class Method to Compute
Employee Wage - Use Class Method and Class */

public class EmployeeWageComputation {

	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	public static final int emp_rate_per_hour = 20;
	public static final int num_of_working_days = 2;
	public static final int max_hrs_in_month = 10;
	
	public static int computeEmpWage() {
		
		System.out.println("Welcome to Employee Wage Computation Program!");

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= max_hrs_in_month && totalWorkingDays <= num_of_working_days) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case is_part_time:
				empHrs = 4;
				break;
			case is_full_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * emp_rate_per_hour;
		System.out.println("Total Emp Wage: " + totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args) {

		computeEmpWage();
		
	}
}
