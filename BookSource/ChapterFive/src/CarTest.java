public class CarTest {

	public static void main(String[] args) {

		Car sedan = new Car(50);
		sedan.getSpeed();
		sedan.hitBrakes(10);
		sedan.getSpeed();

		Car ferrari = new FerrariF430(100);
		ferrari.getSpeed();
		ferrari.changeSpeed(100);
		ferrari.getSpeed();
		ferrari.stopCar();
		ferrari.getSpeed();
		ferrari.hitBrakes(0);

		FerrariF430 spider = new FerrariF430(0);
		spider.engineType();
		spider.steeringWheel();
	}
}
