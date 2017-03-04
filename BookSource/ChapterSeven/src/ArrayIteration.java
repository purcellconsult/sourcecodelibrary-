/******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Figure 7.3: Array iteration example. 
 * 
 ******************************/

public class ArrayIteration {

	public static void main(String[] args) {

		double[] decimalPoints = new double[5];
		decimalPoints[0] = 2.0;
		decimalPoints[1] = 0.27;
		decimalPoints[2] = 17.7;
		decimalPoints[3] = 9.22;
		decimalPoints[4] = 99.2;
		for (int i = 0; i < decimalPoints.length; i++) {
			System.out.print(decimalPoints[i] + " ");
		}
	}
}
