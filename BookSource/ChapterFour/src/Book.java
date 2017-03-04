/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 4.10: Getter and setter method demo. 
* 
* 
*******************************************/

public class Book {

	private double price;
	private String authorFirstName;
	private String authorLastName;
	
	public double setPrice(double price) {
		this.price = price;
		return price;
	}

	public void getPrice() {
		System.out.println(price);
	}

	public String setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
		return authorFirstName;
	}

	public void getAuthorFirstName() {
		System.out.println(authorFirstName);
	}

	public String setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
		return authorLastName;
	}

	public void getAuthorLastName() {
		System.out.println(authorLastName);

	}
}
