package payrollCalculations;

import java.util.Scanner;

public class SalariedEmployee  extends Employee{
	
	double WeeklySalary;
	
	
	
	
	@Override
	public double calculateSalary() {
		
		return WeeklySalary;
	}
	
	@Override
	public void accept(Scanner sc) {
	
		super.accept(sc);
		System.out.println("weekly salary ");
		WeeklySalary=sc.nextDouble();
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [WeeklySalary=" + calculateSalary()+ ", toString()=" + super.toString() 
				 + "]";
	}
	
	

}
