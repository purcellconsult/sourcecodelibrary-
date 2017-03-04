public class LocalClassDemo {
	
	// outer class instance fields 
	private int a = 5;
	private int b = 10;
	private double c = 12.356;
	
	public void doCalculations(int a, int b) {
		// inner local class
		class Compute {
			int d;
			void getInt() {
				System.out.println(a + b);
			}
		}
		// instance of inner local class 
		Compute compute = new Compute();
		compute.getInt();
	}
	
	public static void main(String [] args) {
	 //instance of outer class 
	 LocalClassDemo demo = new LocalClassDemo();
	 System.out.println(demo.a);
	 System.out.println(demo.b);
	 System.out.println(demo.c);
	 demo.doCalculations(1,1);
	}
}
