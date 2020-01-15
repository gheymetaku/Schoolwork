package softwarefundamentalsweek1;

/**
 *
 * @author Omer Siddiqui
 */
public class Vowels {
    public static void main(String args[]) {
    char[] vowels = new char[5];
    vowels[0] = 'a';
    vowels[1] = 'e';
    vowels[2] = 'i';
    vowels[3] = 'o';
    vowels[4] = 'u';

    for (int i = 0; i < vowels.length; i++) {
        System.out.print(vowels[i]);
    }
  }
}
