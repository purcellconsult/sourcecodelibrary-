/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* This is a program that tests the 
* various bit operators in java. 
*
*
*****************************************/
	
	public class BitOperators {
	
	public static void main(String [] args) {
	

		/** bitwise operators and logical shifts */
		
		{
			System.out.println("*---- bitwise operators and logical shifts ----*");
			
			int a = 5 & 6; 	// 0100 & 0110 = 0100
			System.out.println("5 & 6 = " + a);
			
			int b = 1 | 2; 	// 0001 | 0010
			System.out.println("1 | 2 = " + b);
			
			int c = 5 ^ 15;	// 0101 XOR 1111 = 1010
			System.out.println("5 ^ 15 = " + c);
			
			int binaryBit = (byte)0b0111_1111; // 127 in binary
			System.out.println("The complement of 0111-1111 in binary = " + ~binaryBit);  // 1000_0000 or -128 in binary 
			
			boolean theTruth = 1 < 0 & 2 > 5;
			System.out.println("1 < 0 & 2 > 5 is = " + theTruth);
			
			int leftShift = 0b1111 << 0b0001; 							// left shift to the left 1-bit, becomes 0001-1110
			System.out.println("0b1111 << 0b0001 = " + leftShift);
			
			int rightShift = 0b1111 >> 0b0100; 							// shifts to the right 4-bits, becomes 0000
			System.out.println("0b1111 >> 0b0100 = " + rightShift);
			
			System.out.println(0b1111 >>> 0b0001); 						// equivalent to >> when it's positive integers 
			
			System.out.println(0b1000_0000 >>> 0b0000_0001);
			System.out.println(-5 >>> 3); 	// same as 0001-1111-1111-1111-1111-1111-1111-1111
			System.out.println(-5L >>> 3);
			System.out.println(Long.toBinaryString(-5L));
			System.out.println(Long.toBinaryString(-5L >>>3));
		}
		
	}

}