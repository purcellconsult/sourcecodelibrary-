/******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Figure 7.5: Manipulating elements of an array example.  
 * 
 ******************************/

public class ManipulatingElements {

	public static void main(String[] args) {

		String[] lowerCaseVowels = { "a", "e", "i", "o", "u" };
		for (int i = 0; i < lowerCaseVowels.length; i++) {
			lowerCaseVowels[i] = lowerCaseVowels[i].toUpperCase();
			System.out.print(lowerCaseVowels[i] + " ");
		}
	}
}