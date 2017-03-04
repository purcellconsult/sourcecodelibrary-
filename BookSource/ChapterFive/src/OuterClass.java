/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.19: Outer class demo.  
* 
* 
*******************************************/

public class OuterClass {
	
	private int a;
	private double b;
	private float c;
	
	private static class StaticInnerClass {
		
		private static int d;
		private double e;
		private String f;
		}
		public static void main(String [] args) {
	
		OuterClass.StaticInnerClass test = new OuterClass.StaticInnerClass();
			
		}
}

