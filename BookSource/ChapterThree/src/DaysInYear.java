/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* 
* Shows how to print the number of days 
* in a year. 
*
*****************************************/

public class DaysInYear {

	public static void main(String[] args) {

		int i = 1;
		do {
			if (i == 1) {
				System.out.println("\"The number of days in a common year\"");
			}
			System.out.print(i + " ");
			i++;
		} while (i < 366);

	}
}
