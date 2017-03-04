/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.9: Interface example.     
*
* In the book, this program intentionally had an error. 
* A subclass must implement an interface in order
* to instantiate it. 
* 
*******************************************/


public interface Remote {

	boolean turnOn();

	boolean turnOff();

	public static void main(String[] args) {
		Remote screen1 = new Screen1();
		System.out.println(screen1.turnOn());
		Remote screen2 = new Screen2();
	}

	class Screen1 implements Remote {

		public boolean turnOn() {
			return true;
		}

		public boolean turnOff() {
			return false;
		}
	}

	class Screen2 implements Remote {

		public boolean turnOn() {
			return true;
		}

		public boolean turnOff() {
			return false;

		}
	}
}
