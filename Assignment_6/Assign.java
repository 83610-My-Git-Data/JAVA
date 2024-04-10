package assign6;

import java.util.Scanner;

public class Assign {
	public String str;

	Scanner sc = new Scanner(System.in);

	public Assign() {
		str = "";
	}

	public Assign(String str) {
		super();
		this.str = str;
	}
 
	public void accept() throws ExceptionLineTooLong {
			System.out.println("Enter a string-");
			str=sc.next();
			if(str.length()>80) 
				throw new ExceptionLineTooLong();
			System.out.println("Program executed successfully");
		}
	
	
}

//		
