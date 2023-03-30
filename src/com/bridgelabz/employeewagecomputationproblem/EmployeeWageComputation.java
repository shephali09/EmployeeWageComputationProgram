package com.bridgelabz.employeewagecomputationproblem;

public class EmployeeWageComputation {

	public static final int is_part_time = 1;
	public static final int is_full_time = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company, int emp_rate_per_hour, int num_of_working_days,
			int max_hours_in_month) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, emp_rate_per_hour, num_of_working_days,
				max_hours_in_month);
		numOfCompany++;
	}

	private void computeEmpwage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {

		System.out.println("Welcome to Employee Wage Computation Program!");

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= companyEmpWage.max_hours_in_month
				&& totalWorkingDays < companyEmpWage.num_of_working_days) {
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
		return totalEmpHrs * companyEmpWage.emp_rate_per_hour;
	}

	public static void main(String[] args) {

		EmployeeWageComputation empWageBuilder = new EmployeeWageComputation();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
		empWageBuilder.computeEmpwage();

	}
}
