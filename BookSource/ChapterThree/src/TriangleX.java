/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Prints a triangle using a 'X' pattern. 
* 
*  Output: 
*  
*  XXXXXX
*  XXXX
*  XX
*  X
*
*****************************************/

public class TriangleX {

	public static void main(String[] args) {
		int i = 1;
		int j = 6;
		while (i <= 4) {
			i++;
			while (j > 0) {
				System.out.print("X");
				j--;
			}
			if (j == 0 & i == 2) {
				j = j + 4;
			} else if (j == 0 & i == 3) {
				j = j + 2;
			} else {
				j++;
			}
			System.out.println();
		}
	}
}
