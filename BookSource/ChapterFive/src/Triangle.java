/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.11: A class that implements an interface. 
* 
* 
*******************************************/

public class Triangle implements Shapes {

	private double a;
	private double b;
	private double c;
	double base;
	double height;

	public void setPerimeter(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setArea(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double perimeter() {
		double perimeter = a + b + c;
		return perimeter;
	}

	public double area() {
		double area = .5 * (base * height);
		return area;
	}
}
