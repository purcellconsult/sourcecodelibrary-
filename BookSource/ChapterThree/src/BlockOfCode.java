/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Figure 3.0: A block of code in Java. 
* Shows how to create a block of code. 
* Need to use curly braces { ... } 
*
*****************************************/
	
public class BlockOfCode {

	public static void main(String[] args) {

		{
			double listPrice = 100;
			double discountRate = .25;
			double salePrice = 0.0;
			salePrice = listPrice - (listPrice * discountRate);
			System.out.println("The new price is = " + "$" + salePrice);
		}

	}
}
