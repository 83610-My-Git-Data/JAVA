package payrollCalculations;

import java.util.Scanner;

public class CommissionEmployees extends Employee {
	double grossSales;
	int commRate;
	double salary;

	@Override
	public double calculateSalary() {

		return  commRate * grossSales;

	}

	@Override
	public void accept(Scanner sc) {

		super.accept(sc);
		System.out.println("commisiton Rate ");
		commRate = sc.nextInt();
		System.out.println("grossSales ");
		grossSales = sc.nextDouble();

	}

	@Override
	public String toString() {
		return "CommissionEmployees [grossSales=" + grossSales + "\n"+" commRate=" + commRate + "\n" +" salary=" + calculateSalary()
				+ ", toString()=" + super.toString() + "]";
	}

}