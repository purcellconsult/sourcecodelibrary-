/*******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Computes the sum of the elements of
 * an array.   
 * 
 *******************************/

public class TotalSales {

	public static void main(String[] args) {

		double[] todaySales = { 489.1, 262.99, 99.981, 567.99 };

		double sales = 0.0;
		for (int i = 0; i < todaySales.length; i++) {
			sales += todaySales[i];
		}
		System.out.println("Total sales for today is " + sales);
	}
}