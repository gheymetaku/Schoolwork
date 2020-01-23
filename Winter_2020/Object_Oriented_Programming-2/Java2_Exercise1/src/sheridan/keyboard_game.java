package sheridan;

import java.util.Scanner;

public class keyboard_game {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num = 1;
    	
    	while ( num > 0 ) {
    		System.out.print("Please enter the next input: ");   	
    		num = input.nextInt();
    		
    		if (num == 2) {
    			System.out.println("move down");
    		}
    		
    		else if (num == 4) {
    			System.out.println("move left");
    		}
    		
    		else if (num == 6) {
    			System.out.println("move right");
    		}
    		
    		else if (num == 8) {
    			System.out.println("move up");
    		}
    		
    		else if (num == 0) {
    			break;
    		}
    		
    		else if (num == 1 || num == 3 || num == 7 || num == 9) {
    			System.out.println("no diagonal moves allowed");
    		}
    		
    		else {
    			System.out.println("bad input");
    		}
    	}
	}
}
