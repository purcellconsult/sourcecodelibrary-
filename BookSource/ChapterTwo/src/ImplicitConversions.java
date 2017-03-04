/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* This program shows the various 
* implicit conversions of the primitive 
* types in Java 
*
*
*****************************************/

public class ImplicitConversions {

	public static void main(String[] args) {

		int x = 15;
		int y = x;
		long z = y;
		float hugeNumber = 2305373783393988393L;

		short varA = 0b1001_1111;
		float varB = hugeNumber;
		float varC = 56;
		double varD = 77.98F;
		double varE = 0.8227282928820202F;

		System.out.println("Implicit conversion from int to long " + z);
		System.out.println("Implicit conversion from byte to short " + varA);
		System.out.println("Implicit conversion from long to float " + hugeNumber);
		System.out.println("Implicit conversion from long to float " + varB);
		System.out.println("Implicit conversion from int to float " + varC);
		System.out.println("Implicit conversion from float to double " + varD);
		System.out.println("Implicit conversion from float to double " + varE);

	}
}