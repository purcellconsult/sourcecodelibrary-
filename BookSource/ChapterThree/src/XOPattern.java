/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Prints a 'X' and 'O' pattern. 
* 
*  Output: 
*  
*  XOXOXO
*  XOXOXO
*  XOXOXO
*  XOXOXO
*  XOXOXO
*  XOXOXO
*
*****************************************/

public class XOPattern {

	public static void main(String[] args) {

		for (int i = 1; i < 7; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 == 1) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}
}
