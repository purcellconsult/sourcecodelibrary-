/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 3.9: A nested for loop demo. 
* 
* Shows how to use a nested for loop 
* in Java. Prints the multiplication tables from 1..12.
* i.e, 1 x 1 = 1, 1 x 2 = 2, ... 12 x 12 = 144.  
*
*******************************************/

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.println(i + "x" + j + " = " + i * j);
			}
		}

	}
}
