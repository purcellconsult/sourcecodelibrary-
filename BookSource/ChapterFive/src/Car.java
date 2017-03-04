/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.7: Overridden method example. 
* 
* 
*******************************************/

public class Car {

	private int speed;

	public Car(int currentSpeed) {
		speed = currentSpeed;
		System.out.println("start car...");
	}

	public void changeSpeed(int speed) {
		this.speed = speed;
	}

	public void getSpeed() {
		System.out.println(speed);
	}

	public void stopCar() {
		System.out.println("car is stopping...");
		this.speed = 0;
	}

	public int maxSpeed(int maxSpeed) {
		return maxSpeed;
	}

	public void hitBrakes(int deccelerate) {
		speed -= deccelerate;
		String message = (speed < 0) ? "Speed can't be negative" : "Your speed is now " + speed;
		System.out.println(message);
	}
}
