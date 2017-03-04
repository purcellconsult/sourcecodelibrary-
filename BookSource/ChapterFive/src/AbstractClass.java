
public abstract class AbstractClass {

	private int a;
	private int b;

	public AbstractClass(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public void addSum() {
		int sum = a + b;
		System.out.println(sum);
	}

}
