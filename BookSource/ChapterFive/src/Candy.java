/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 5.22: Anonymous class demo. 
* 
* 
*******************************************/

public class Candy {
	
	public double getCost() {
		return 0.0;
	}
	
	Candy candyBar = new Candy() {
		public double getCost() {
			return 2.50;
		}
	};	
}
