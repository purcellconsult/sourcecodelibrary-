/******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Figure 10.4: Calculating total, count, and average with Scanner.   
 * 
 * 
 ******************************/

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		double sum = 0;
		double count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in any double");
		System.out.println("The program will calculate: total and average");
		System.out.println("Press  any character to exit");
		while (scan.hasNextDouble()) {
			sum += scan.nextDouble();
			count++;
		}
		System.out.println("The total is " + sum);
		System.out.println("The count is " + (int)count);
		System.out.println("Average is " + sum / count);
	}
}
