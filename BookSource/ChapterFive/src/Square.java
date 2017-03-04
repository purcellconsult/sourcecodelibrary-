/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.13: A class that implements an interface.  Square.java.
* 
*******************************************/

public class Square implements Shapes {

	private double a;

	public Square(double a) {
		this.a = a;
	}

	public double perimeter() {
		return 4 * a;
	}

	public double area() {
		return a * a;
	}
}
