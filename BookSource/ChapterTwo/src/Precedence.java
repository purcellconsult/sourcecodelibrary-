/*****************************************
* @author: Doug Purcell 
* website: www.purcellconsult.com
*
* This is a program that illustrates examples relating to 
* precedence and associativity. Most of these examples are purely academic. 
*
*
******************************************/

public class Precedence {

	public static void main(String[] args) {

		{
			System.out.println(5 + 2 * 3); // prints 11
			System.out.println(5 % 2 * 18); // prints 18
			System.out.println(7 * 5 / 8 % 2); // prints 0
			System.out.println(12 / 1 / 2 / 3 * 4 / 2); // prints 4
			System.out.println(5 + 6 * 3 + 1 * 5); // prints 28
			System.out.println((5 + 6) * 3 + (1 * 5)); // prints 38
			System.out.println((5 + 3) * (6 % 2) / (85 * 3) - (2 * 3) % (6 / 5)); // prints 0
																				
			System.out.println((2 * 3 % 6 / 5 * 5 + 3 / 6 % 4 + 85 * 3)); // prints 255
																		
			System.out.println((2 * 3) + (6 / 5) * (5 + 3) / (6 % 4) - (85 * 3)); // prints -245
																					
			System.out.println((5 - 2 + 8 % 2 / 3 * 5)); // prints 3
			System.out.println(9 + (3) * (5) - (5 + 11 * 2 / 3) * 5); // prints -36
			System.out.println("------------");
			
			{
				int i = 1;
				int j = 1;
				int k = 1;

				System.out.println(i++ + i); // prints 3
				System.out.println(j++ * j / j + ++j - 5); // prints -1
				System.out.println(k++ + k++ + k++ + k++ + k++); // prints 15
				System.out.println(k); // prints 6

				int x1 = 5;
				int y1 = 10;
				int z1 = ++x1 * y1--;
				System.out.println("z1 = " + z1 + y1 + x1); // prints z1 = 6096

				int e = 1;
				System.out.println("hello " + (++e + 3 * e++ * e / 2)); // prints hello 11
			
				int a, b, c, d;
				a = b = c = d = 0;
				a = (++a + b++) * ((++c / 2 + d++) % 2);
				System.out.println("a = " + a); // prints a = 0
				
				int o = 1;
				System.out.println("This is Sparta! " + (++o % 2 * o / 2 / o / 2 * o++ + 5 * ++o)); // prints This is Sparta! 20
				System.out.println("o = " + o); // prints o = 4

			}
		}
	}
}