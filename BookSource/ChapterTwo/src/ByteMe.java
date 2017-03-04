/****************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* This is a simple class that
* explores the byte primitive type in Java. 
* 
*
******************************************/

	public class ByteMe {
		
		public static void main(String [] args) {
			
			/** Byte data type in Java is a 8-bit signed two's complement. -2^7 is smallest integer value. */
			byte smallest = -128;
			/** Byte data type in Java is a 8-bit signed two's complement. 2^7-1 is largest integer value */
			byte largest = 127;
			byte x = 20;
			
			
			/** The following operation exceeds the 8-bit memory limit allocated to bytes, also called 
			*   arithmetic Overflow. 
			*   127 represented in 8-bit binary is  ==> 0111-1111
			*  -128 represented in 8-bit binary is ==>  1000-0000
			*   sum 127 + 20 equals 147 with int data type. But in binary it overflows: 0111-1111
			*										   +0001-0100
			*										    ---------	
			*										    1001-0011
			*/
			
			byte overFlow = (byte)(largest + x);
			int correct = (largest + x);
			
			System.out.println("This is the smallest Integer in Java: " + smallest);
			System.out.println("This is the largest Integer in Java: " + largest);
			System.out.println("This will create an issue: " + overFlow);
			System.out.println("Implicit cast to integer gives correct result: " + correct);
			
		}
		
	}