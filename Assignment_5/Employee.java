package payrollCalculations;

import java.util.Scanner;

public abstract class Employee {
	
private	String fName;
private	String lName;
private  String ssn;
	
	public void accept(Scanner sc) {
		
		System.out.println("Fname ");
		   
		fName=sc.next();
		
		System.out.println("lname ");
		lName=sc.next();

		System.out.println("SSN");
         ssn=sc.next();
		
	}
	
	
	@Override
	public String toString() {
		
		return ("Fname - "+fName+"lname - "+lName+"SSN - "+ ssn);
	}

	
	public abstract double calculateSalary();
	
}
