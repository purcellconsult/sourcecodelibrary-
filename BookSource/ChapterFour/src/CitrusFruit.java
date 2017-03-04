/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 4.13: Enum demo.
*
* 
*******************************************/

public enum CitrusFruit {
	
	LEMONS, GRAPE_FRUIT, ORANGES, TANGERINES, 
	LIMES, POMELO, BLOOD_ORANGE, BUDDHAS_HAND;
	
	public static void main(String [] args) {
		CitrusFruit fruit = CitrusFruit.LEMONS;
		System.out.println(fruit);
	}
}
