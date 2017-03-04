/****************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Shows how to print the first 14 Fibonacci numbers. 
* 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233. 
*
******************************************/

public class Fibonacci {

	public static void main(String[] args) {
		int F_n_1 = 0;
		int F_n_2 = 1;
		int nextValue;
		System.out.println(0);

		for (int i = 1; i <= 13; i++) {
			nextValue = F_n_1 + F_n_2;
			System.out.println(nextValue);
			F_n_2 = F_n_1;
			F_n_1 = nextValue;
		}
	}
}
