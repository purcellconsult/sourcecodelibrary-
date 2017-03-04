/*********************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* This is a program that tests the ternary operator, also known as 
* conditional operator in Java. 
*
*
**************************************/
	
	public class Ternary {
		
		public static void main(String [] args) {
			
			int weightX = 5;
			int weightY = 10;
			int max;
			String x = "";
			/** Finds the maximum value of two values */
			max = (weightX > weightY) ? weightX : weightY; 
			/** Tests to see if x is empty */
			x = (x.equals(null)) ? "not an empty String" : "Empty String"; 
			
			System.out.println("The maximum weight = " + max);
			System.out.println(x);
		}
		
	}