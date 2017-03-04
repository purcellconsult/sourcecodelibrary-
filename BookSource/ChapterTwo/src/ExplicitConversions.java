/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* This program shows an explicit conversion 
* from short to byte and from int to byte
* The () or cast operator must be used. 
*
*****************************************/

public class ExplicitConversions {

	public static void main(String[] args) {
		short a = 20;
		byte b = (byte) a;
		int c = 200;
		byte d = (byte) c;

		System.out.println("Narrow conversion from short to byte " + b);
		System.out.println("Narrow conversion from int to byte " + d);

	}
}
