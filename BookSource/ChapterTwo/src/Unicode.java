/****************************************
*
* @author: Doug Purcell 
* @website: http://www.purcellconsult.com
*  
* This program shows how to use Unicode characters in
* Java. 
*
******************************************/

	public class Unicode {
		
		public static void main(String [] args) {
			
			char c = '\u0063';
			char latinCaptialE = '\u00C8';
			char multiplicationSign = '\u00D7';
			System.out.println(c);
			System.out.println(latinCaptialE);
			System.out.println(multiplicationSign);
			
		}
		
	}