public class ExpressCook extends Options implements Microwave {

	@Override
	public void heat(int reheat) {
		switch (reheat) {
		case 1:
			cookTime += 1;
			System.out.println("reheating 1 serving of pasta");
			break;
		case 2:
			cookTime += 8;
			System.out.println("reheating 1 serving of meat");
			break;
		case 3:
			cookTime += 3;
			System.out.println("reheating 1 serving of veggies");
			break;
		default:
			System.out.println("Enter type of food one serving:\n" + "1: pasta 2: meat 3: veggies");
		}
	}

	public void addTime(int time) {
		double add = 0.0;
		switch (time) {
		case 1:
			cookTime += 1;
			break;
		case 2:
			cookTime += 2;
			break;
		case 3:
			cookTime += 3;
			break;
		case 4:
			cookTime += 4;
			break;
		case 5:
			cookTime += 5;
			break;
		case 6:
			cookTime += 6;
			break;
		case 30:
			cookTime = (double) (time += add) / 100; // converts int to double
			break;
		default:
			System.out.println("Enter cook time of 30 seconds, or 1-6 minutes");
		}
	}
}
