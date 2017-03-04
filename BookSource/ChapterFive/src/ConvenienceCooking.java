public class ConvenienceCooking extends Options implements Microwave {

	@Override
	public void heat(int servingInPounds) {
		switch (servingInPounds) {
		case 1:
			cookTime += 8;
			System.out.println("Defrosting 1 lb of food");
			break;
		case 2:
			cookTime += 16;
			System.out.println("Defrosting 2 lbs of food");
			break;
		case 3:
			cookTime += 24;
			System.out.println("Defrosting 3 lbs of food");
			break;
		case 4:
			cookTime += 32;
			System.out.println("Defrosting 4 lbs of food");
			break;
		default:
			System.out.println("Enter number of servings in pounds: Options are 1-4");
		}
	}

	protected double microwavePopcorn() {
		cookTime += 3.30;
		return 3.30;
	}

	protected double microwavePotato() {
		cookTime += 7.00;
		return 7.00;
	}
}
