/************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* This class explores the min and 
* max values for the int primitive type in Java 
*
*
****************************************/

	public class Integers {
		
		public static void main(String [] args) {
			
			/** Int data type in Java is signed two's complement. -2^31 is smallest Integer value. */
			int smallest = -2147483648;
			/** Int data type is a 32-bit signed two's complement. 2^32-1 is largest value */
			int largest = 2147483647;
			
			System.out.println("This is the smallest Integer in Java: " + smallest);
			System.out.println("This is the largest Integer in Java: " + largest);
			
		}
		
	}