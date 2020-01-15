package sheridan;

public class beerbottles99 {
	public static void main(String[] args) {
		for(int i=99;i>=1;i--) {
			if (i==1) {
				System.out.println(i + " bottle of beer on the wall, "+ i + " bottle of beer.");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
				System.out.println("");
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			}
			else if (i==2) {
				System.out.println(i + " bottles of beer on the wall, "+ i + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (i-1) + " bottle of beer on the wall.");
				System.out.println("");
			}
			else {
				System.out.println(i + " bottles of beer on the wall, "+ i + " bottles of beer.");
				System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
				System.out.println("");
			}
		}
	}
}
