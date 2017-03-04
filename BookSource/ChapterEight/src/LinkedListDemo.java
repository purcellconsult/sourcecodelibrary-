
import java.util.LinkedList;
public class LinkedListDemo {
	public static void main(String [] args) {
		LinkedList<String>europeanCities = new LinkedList<String>();
		europeanCities.add("Paris");
		europeanCities.add("London");
		europeanCities.add("Lisbon");
		europeanCities.add("Amsterdam");
		europeanCities.add("Berlin");
		
		for(String s: europeanCities) 
		      System.out.print(s + " ");

		
	}
}

