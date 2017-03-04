/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 3.8: A nested while loop demo. 
* 
* Shows how to use a nested while loop 
* in Java. 
*
*****************************************/

public class NestedWhileLoop {

	public static void main(String[] args) {

		int i = 0;
		while (i <= 2) {
			int j = 0;
			while (j <= 3) {
				System.out.println("i = " + i + " " + "j = " + j);
				j++;
			}
			i++;
		}

	}
}
