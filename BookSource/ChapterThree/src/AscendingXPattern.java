/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Prints an ascending X pattern. 
* 
*  Output: 
*  
*  XOOOO
*  XXOOO
*  XXXOO
*  XXXXO
*  XXXXX
*
*****************************************/

public class AscendingXPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("X");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("O");
			}
			System.out.println();
		}
	}
}
