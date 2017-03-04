/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Shows how to print the chars from ! 
* to ~
*
*****************************************/

public class PrintChars {

	public static void main(String[] args) {

		char exclamatoryMark = '\u0021';
		char deleteCode = '\u007F';
		while (exclamatoryMark < deleteCode) {
			System.out.print((char) exclamatoryMark + " ");
			exclamatoryMark++;
		}
	}
}
