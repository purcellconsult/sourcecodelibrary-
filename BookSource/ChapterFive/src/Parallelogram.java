/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.12: A class that implements an interface.  
* 
* 
*******************************************/

public class Parallelogram implements Shapes {

	private double a;
	private double b;
	private double base;
	private double height;

	public void setPerimeter(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double perimeter() {
		return 2 * (a + b);

	}

	public void setArea(double base, double height) {
		this.base = base;
		this.height = height;

	}

	public double area() {
		return base * height;
	}

}
