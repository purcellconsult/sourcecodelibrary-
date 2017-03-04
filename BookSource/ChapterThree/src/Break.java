/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 3.10: A break statement demo.  
* 
* Shows how to use a break statement 
* to control the flow of statements. 
*
*******************************************/

public class Break {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			if (i == 3) {
				break;
			} else {
				System.out.println(i);
			}
		}
	}
}
