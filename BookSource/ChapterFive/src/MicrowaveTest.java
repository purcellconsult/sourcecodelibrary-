public class MicrowaveTest {
	
	public static void main(String [] args) {
		
		ConvenienceCooking food = new ConvenienceCooking();
		food.viewCookTime(); //prints 0
		System.out.println(food.turnTable(1)); 		// prints on
		System.out.println(food.surfaceLight("on")); 	//prints on
		food.heat(3);
		food.microwavePopcorn();
		food.microwavePotato();
		food.viewCookTime(); 	// displays total cook time 
		food.cancel(); 			// sets cook time equal to 0
		food.viewCookTime();		//  displays total cook time 
		System.out.println("-------");
		ExpressCook express = new ExpressCook();
		express.addTime(30);
		express.viewCookTime();
		express.heat(1);
		express.heat(2); 
		express.heat(3);
		express.heat(4); // prints an error message 
		express.viewCookTime(); // displays total cook time 
	}
}
