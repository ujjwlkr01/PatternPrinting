package patternPrinting;

public class pattern4 {

	/*  design pattern
	 *      ****
	 *      ***
	 *      ** 
	 *      *
	 */
	
	public static void main(String[] args) {
		int n = 4; // no of rows

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
