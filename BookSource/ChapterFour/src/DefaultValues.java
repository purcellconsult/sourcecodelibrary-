/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 4.8: Tests the default values in Java. DefaultValues.java. 
* 
* 
*******************************************/
public class DefaultValues {

	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	String i;
	DefaultValues j;

	public static void main(String[] args) {

		DefaultValues test = new DefaultValues();

		System.out.println("Default value for byte is " + test.a);
		System.out.println("Default value for short is " + test.b);
		System.out.println("Default value for int is " + test.c);
		System.out.println("Default value for long is " + test.d);
		System.out.println("Default value for float is " + test.e);
		System.out.println("Default value for double is " + test.f);
		System.out.println("Default value for char is " + test.g);
		System.out.println("Default value for boolean is " + test.h);
		System.out.println("Default value for String is " + test.i);
		System.out.println("Default value for DefaultValues is " + test.j);
	}
}
