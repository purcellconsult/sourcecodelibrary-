/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Shows how to print a right triangle 
* using asterisks. 
* 
*  Output: 
*  
* -  *
* -  **
* -  ***
* -  ****
* -  ***** 
*****************************************/

public class RightTriangleStars {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
