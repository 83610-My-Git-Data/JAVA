package payrollCalculations;

import java.util.Scanner;

public class BasePlusComm extends CommissionEmployees {
	
	
	double baseSalary;
	
	
	@Override
	public double calculateSalary() {
	
		return (super.calculateSalary()+baseSalary);
	   
		
	}
	
  public double salaryAfterIncrement() {
		double totalsal = baseSalary*0.1 +this.calculateSalary();
	return totalsal;
	}
@Override
public void accept(Scanner sc) {
	
	super.accept(sc);
	System.out.println("Enter Base salary ");
	 baseSalary=sc.nextDouble();
}
	@Override
	public String toString() {
		return "BasePlusComm [baseSalary=" + baseSalary + ", toString()=" + super.toString() +"Salary after increment -  "+salaryAfterIncrement()+"]";
	}
	

	
	

}
