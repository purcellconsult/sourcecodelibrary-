/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
*
* Figure 3.4: Switch statement demo.   
* Shows how to create a switch statement
* in java. 
*
*****************************************/

public class SwitchStatement {

	public static void main(String[] args) {
	String fingerName = " ";
	int fingerNumber = 2;  
	switch(fingerNumber) {
		case 1: fingerName = "pinky";
			break;
		case 2: fingerName = "ring";
			break;
		case 3: fingerName = "middle";
			break;
		case 4: fingerName = "index";
			break;
		case 5: fingerName = "thumb";
			break;
			default: fingerName = "Invalid Option!";
		}
		System.out.println(fingerName);
	}
}
