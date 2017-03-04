/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 4.11: Tests the static fields in Java. 
* 
* 
*******************************************/
public class Static {

	private static int ten = 10;
	private static String greeting = "Hello";
	private static char zee = 'Z';
	private static boolean truth = true;

	public static void main(String[] args) {
		System.out.println(ten);
		System.out.println(greeting);
		System.out.println(zee);
		System.out.println(truth);
	}
}
