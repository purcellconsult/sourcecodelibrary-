/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Prints the text JAVA! in a pattern. 
* 
*  Output: 
*  
*  J****
*  *A***
*  **V**
*  ***A*
*  ****!
*****************************************/

public class JavaPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i == 1 && j == 1) {
					System.out.print("J");
					continue;
				} else if (i == 2 && j == 2) {
					System.out.print("A");
					continue;
				} else if (i == 3 && j == 3) {
					System.out.print("V");
					continue;
				} else if (i == 4 && j == 4) {
					System.out.print("A");
					continue;
				} else if (i == 5 && j == 5) {
					System.out.print("!");
					continue;
				}
				System.out.print("*");

			}
			System.out.println();
		}

	}
}
