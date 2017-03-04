/******************************
 * @author Doug Purcell
 * website: http://www.purcellconsult.com
 *
 * Figure 7.4: Enhanced for loop demo. 
 * 
 ******************************/

public class Enhanced {

	public static void main(String[] args) {
		
		String[] names = {"Dan", "Alex", "Carlos", "Deshaun"};
		for(String printNames : names)
			System.out.print(printNames + " ");
	}
}