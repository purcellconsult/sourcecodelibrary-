public class CitrusFruitTwoTester {

	CitrusFruit fruit;

	public CitrusFruitTwoTester(CitrusFruit fruit) {
		this.fruit = fruit;
	}

	public void getFruit() {
		switch (fruit) {
		case LEMONS:
			System.out.println(CitrusFruit.LEMONS);
			break;
		case GRAPE_FRUIT:
			System.out.println(CitrusFruit.GRAPE_FRUIT);
			break;
		case ORANGES:
			System.out.println(CitrusFruit.ORANGES);
			break;
		case TANGERINES:
			System.out.println(CitrusFruit.TANGERINES);
			break;
		case LIMES:
			System.out.println(CitrusFruit.LIMES);
			break;
		case POMELO:
			System.out.println(CitrusFruit.POMELO);
			break;
		case BLOOD_ORANGE:
			System.out.println(CitrusFruit.BLOOD_ORANGE);
			break;
		case BUDDHAS_HAND:
			System.out.println(CitrusFruit.BUDDHAS_HAND);
			break;
		default:
			System.out.println("Incorrect options!");
			break;
		}
	}

	public static void main(String[] args) {
		CitrusFruitTwoTester citrusOne = new CitrusFruitTwoTester(CitrusFruit.LEMONS);
		citrusOne.getFruit();
		CitrusFruitTwoTester citrusTwo = new CitrusFruitTwoTester(CitrusFruit.GRAPE_FRUIT);
		citrusTwo.getFruit();
		CitrusFruitTwoTester citrusThree = new CitrusFruitTwoTester(CitrusFruit.ORANGES);
		citrusThree.getFruit();
		CitrusFruitTwoTester citrusFour = new CitrusFruitTwoTester(CitrusFruit.TANGERINES);
		citrusFour.getFruit();
		CitrusFruitTwoTester citrusFive = new CitrusFruitTwoTester(CitrusFruit.LIMES);
		citrusFive.getFruit();
	}
}
