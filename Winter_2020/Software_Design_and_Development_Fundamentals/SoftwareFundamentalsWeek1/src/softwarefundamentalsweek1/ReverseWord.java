package softwarefundamentalsweek1;

import java.util.Scanner;

/**
 *
 * @author Omer Siddiqui
 */
public class ReverseWord {
    
        public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String temp = in.nextLine();
        char [] word = new char [temp.length()];
        for(int k = 0; k < temp.length(); k++){
            word[k]=temp.charAt(k);
        }
        
        System.out.print("The entered string is: ");
        for(char i:word){
            System.out.print(i);
        }
        
        System.out.print("\nThe reverse string is: ");
        for(int j = word.length-1; j >=0 ; j--){
            System.out.print(word[j]);
        }
        System.out.println();
    }
}
