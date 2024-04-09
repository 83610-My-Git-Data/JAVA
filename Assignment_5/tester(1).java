package payrollCalculations;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		
		Employee e1;
		Scanner sc = new Scanner(System.in);

		System.out.println("1. calculate SalariedEmployee - ");
		System.out.println("2. calculate HourlyEmployee - ");
		System.out.println("3. calculate CommissionEmployees - ");
		System.out.println("4. calculate BasePlusComm - ");
		int choice;
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			 e1 = new SalariedEmployee(); //up
			e1.accept(sc);
			e1.calculateSalary();
			System.out.println(e1.toString());


			break;
		case 2:
			 e1 = new HourlyEmployee();
			e1.accept(sc);
			e1.calculateSalary();
			System.out.println(e1.toString());


			break;
		case 3:
			 e1 = new CommissionEmployees();
			e1.accept(sc);
			e1.calculateSalary();
			System.out.println(e1.toString());


			break;
		case 4:
			 e1 = new BasePlusComm();
		  BasePlusComm b1 = (BasePlusComm) e1;
				b1.accept(sc);
			b1.salaryAfterIncrement();
			
				System.out.println(b1.toString());
 
			break;

		default:
			break;
		}

		
	}

}
