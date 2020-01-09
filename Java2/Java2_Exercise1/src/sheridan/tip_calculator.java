package sheridan;
import java.util.Scanner;

public class tip_calculator {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
    	System.out.print("Please enter the bill amount: ");
    	double bill = input.nextDouble();
    	
    	System.out.print("Please enter the tip %: ");
    	double tip = input.nextDouble();
    	
    	double finaltip = bill * (tip/100);
    	double finalbill = bill + finaltip;
    	   	
    	System.out.printf("The tip amount is $%.2f and the total is $%.2f", finaltip , finalbill);
	}
}
