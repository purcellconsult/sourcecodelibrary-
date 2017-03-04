/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Prints a 'X' and '■' pattern. 
* 
*  Output: 
*  
*  X X ■ 2 1
*  X X ■ ■ 2 1
*  X X ■ ■ ■ 2 1
*  X X ■ ■ ■ ■ 2 1
*
*****************************************/

public class XSquarePattern {

	public static void main(String[] args) {

		char squareIcon = '\u25a0';

		for (int i = 1; i <= 4; i++) {
			int x = 4;
			while (x > 2) {
				System.out.print("X" + " ");
				x--;
			}
			for (int square = 1; square <= i; square++) {
				System.out.print(squareIcon + " ");
			}
			int k = 2;
			while (k >= 1) {
				System.out.print(k + " ");
				k--;
			}
			System.out.println();
		}
	}
}
