/******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Figure 7.7: Copying arrays. 
 * 
 ******************************/

public class CopyingArrays {

	public static void main(String[] args) {

		int[] oldArray = { 1, 1, 2, 2, 3, 3, 4, 4 };
		int[] newArray = new int[16]; // doubles the size
		for (int i = 0; i < oldArray.length; i++) {
			newArray[i] += oldArray[i];
			System.out.print(newArray[i] + " ");
		}
	}
}
