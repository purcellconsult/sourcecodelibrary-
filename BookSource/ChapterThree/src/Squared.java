/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Shows how to print the squares of the numbers
* from 1...20. 
* 
* i.e: 1*1 = 1, 2*2 = 4, ... 20*20 = 400. 
*
*****************************************/

public class Squared {

	public static void main(String[] args) {

		int i = 1;
		for (int j = 1; j <= 20; j++, i++) {
			System.out.println(i + "*" + j + " = " + i * j);
		}
	}
}
