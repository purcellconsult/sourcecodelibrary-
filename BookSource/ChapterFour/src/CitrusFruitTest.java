
public enum CitrusFruitTest {
	
	LEMONS, GRAPE_FRUIT, ORANGES, TANGERINES, 
	LIMES, POMELO, BLOOD_ORANGE, BUDDHAS_HAND;
	
	public static void main(String [] args) {
		for(CitrusFruitTest fruit: CitrusFruitTest.values()) {
		 System.out.println(fruit);
		}
	}
}
