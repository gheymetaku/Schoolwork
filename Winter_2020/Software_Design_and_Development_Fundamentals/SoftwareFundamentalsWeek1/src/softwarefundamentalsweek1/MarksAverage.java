package softwarefundamentalsweek1;

import java.util.Scanner;

/**
 *
 * @author Omer Siddiqui
 */
public class MarksAverage {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        double [] marks = new double [3];
        System.out.println("Please enter three double values");
        double sum = 0;
        for (int i = 0; i < marks.length; i++){
            marks[i] = input.nextDouble();
            sum += marks[i];
        }
        System.out.printf("Average: %.2f\n",sum/3);
    }    
}
