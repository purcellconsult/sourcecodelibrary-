/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Prints a 4x5 pattern using the'$' symbol. 
* 
*  Output: 
*  
*  $       $       $       $       $
*  $       $       $       $       $
*  $       $       $       $       $
*  $       $       $       $       $
*  
******************************************/

public class MoneyPattern {

	public static void main(String[] args) {
		char dollarSign = '\u0024';

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(dollarSign + " " + '\t');
			}
			System.out.println();
		}
	}
}