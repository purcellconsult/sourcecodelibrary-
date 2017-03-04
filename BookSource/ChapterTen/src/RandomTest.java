/******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Figure 10.1: Random number generator. 
 * 
 ******************************/

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int i = 1;
		Random nums = new Random();
		do {
			int a = (nums.nextInt(100));
			System.out.println(a);
			i++;
		} while (i < 101);
	}
}

