/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Iterates by .15 each iteration 
*
*****************************************/

public class FloatingPointLoop {

	public static void main(String[] args) {
		for (double a = 1; a < 2; a += .15) {
			System.out.println(a);
		}
	}
}
