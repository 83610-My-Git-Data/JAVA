import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        if (sc.hasNextDouble()) {
            double num1 = sc.nextDouble(); 
            System.out.println("It's a double.");
            
            System.out.print("Enter second number: ");
            if (sc.hasNextDouble()) {
                double num2 = sc.nextDouble();
                System.out.println("It's a double.");

                
                double avg = (num1 + num2) / 2;
                System.out.println("Average value: " + avg);
                
            } else {
                System.out.println("Second input is not a double value.");
            }
        } else {
            System.out.println("First input is not a double value.");
        }

       
    }
}
