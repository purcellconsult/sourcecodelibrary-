/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 3.11: Continue statement demo.  
* 
* Shows how to use a continue statement 
* to control the flow of statements. 
*
*******************************************/

public class Continue {

	public static void main(String[] args) {

		for (int i = 1; i < 6; i++) {
			if (i == 3) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}

	}
}
