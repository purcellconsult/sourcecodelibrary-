/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Shows how to print a right triangle 
* using Os. 
* 
* 	Output: 
*  
* -  OOOOO
* -  OOOO
* -  OOO
* -  OO
* -  O
*****************************************/

public class RightTriangleCircles {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("O");
			}

			System.out.println();
		}

	}
}