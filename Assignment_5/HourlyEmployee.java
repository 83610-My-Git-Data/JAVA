package payrollCalculations;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	double wage;
	double Whours;
	double salary;
	
	
	@Override
	public double calculateSalary() {
	
		if(Whours<=40) {
			salary = wage*Whours;
			return salary;
		}
		else if(Whours>40) 
		 salary =40*wage+(Whours-40)* wage*1.5;
		 return salary ;
		
	
	
	}

	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
		
	System.out.println("wage");
	wage=sc.nextDouble();
	System.out.println("Whours");
    Whours=sc.nextDouble();


	}
	
	
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", Whours=" + Whours + ", salary=" + calculateSalary()+ ", toString()="
				+ super.toString()  + "]";
	}

	
	

}
