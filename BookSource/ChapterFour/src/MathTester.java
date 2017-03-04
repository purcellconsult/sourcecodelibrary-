/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 4.6: Invoking a method demo.  
* 
*******************************************/

public class MathTester {

	public static void main(String [] args) {
		Math sum = new Math();
		int result = sum.addNumbers(100, 300);
		System.out.println("The sum is " + result);
	}
}
