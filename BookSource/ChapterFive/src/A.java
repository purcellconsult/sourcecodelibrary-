/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.0: Super class example. 
* 
* 
*******************************************/

public class A {

	private int a;
	protected int b;
	public int c;
	int d;

	public A() {
		System.out.println("This is class A constructor");
	}

	public A(int b, int c) {
		this.b = b;
		this.c = c;
		System.out.println(b + c);
	}

	public A(int b, int c, int d) {
		this.b = b;
		this.c = c;
		this.d = d;
		System.out.println(b * c * d);
	}

	public void foo() {
		System.out.println("foo");
	}

	public void bar() {
		System.out.println("bar");
	}

	public void foobar() {
		System.out.println("foobar");
	}

	public void foofoo() {
		System.out.println("foofoo");
	}

	public void abc() {
		System.out.println("abc");
	}
}
