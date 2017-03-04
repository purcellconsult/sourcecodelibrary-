/**************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* This program shows the various literal data types in Java 
*
*
*****************************************/

	public class Literals {
		
		public static void main(String [] args) {
		
	
			int largestIntNumber = 2_147_483_647; // The digits are separated by the underscore (_)
			int octNum = 007777; 
			int hexNum = 0XFFFF;
	
			double x = 10e3;
			double y = 2e3;
			double z = 12e-6;
			byte a = 0b01111111; // 127 in decimal
			byte b = 0b01111111; // 127 in decimal 
			int conversion = a + b;
			
			byte overFlow = (byte)(a+b); // need to caste to byte or Java will interpret this as an integer 
			byte maxByteValue = a; // can't exceed the max value of 127 for bytes 
			
		
			short s = (short)-32768;
			int largestIntHalfed = 1073741824; // (2^31-1)/2
			
			long fiveTrillion = 5_000_000_000_000L;
			
			double middleInt = 1073741823.5;
			float num = 45.958F; // Java uses doubles as default so must caste to float with a f or F
			double d = 1e308 * 10;
			long j = 250000000000L;
			float largestFloat = 3.40282347E+38F;
			float smallestFloat = -3.40282347E+38F;
			char letterA = 'A';
			char letterB = 'B';
			char yenSymbol = '\u00A5';	// prints yen symbol 
			char yenHex = (char)0xfeff00a5; // prints yen symbol 
			
			System.out.println(largestIntNumber);
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(octNum);
			System.out.println(hexNum);
			System.out.println("bytes converted to int " + conversion);
			System.out.println("byte overFlow = " + overFlow);
			System.out.println("The maximum byte value is: " + maxByteValue);
			System.out.println("short s = " + s);
			System.out.println("The smallest short is " + s);
			System.out.println("This is the largest int value divided by two " +  largestIntHalfed);
			System.out.println("middle int " + middleInt);
			System.out.println("This is a floating point number " + num);
			System.out.println("This is a floating point overflow " + d);
			System.out.println("This is a long integer " + j);
			System.out.println("5 trillion dollars: " + fiveTrillion);
			System.out.println(1.516e5);
			System.out.println("This is the largest float " + largestFloat);
			System.out.println("This is the smallest float " + smallestFloat);
			System.out.println(3.4028234E+38F);
			System.out.println(3.4028234E+38D);
			System.out.println(letterA);
			System.out.println(letterB);
			System.out.println(yenSymbol);
			System.out.println(yenHex);
	
		}
		
	}