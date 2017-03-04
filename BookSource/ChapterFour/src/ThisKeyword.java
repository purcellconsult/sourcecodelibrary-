/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Figure 4.9: This keyword example.  
* 
*******************************************/

public class ThisKeyword {

	public class Burger {

		int numberOfBeefPatties;
		String lettuce;
		String tomato;
		String onion;
		String pickle;

		public Burger(int numberOfBeefPatties, String lettuce, String tomato, String onion, String pickle) {
			if (numberOfBeefPatties > 0 && numberOfBeefPatties < 4)
				this.numberOfBeefPatties = numberOfBeefPatties;
			this.lettuce = lettuce;
			this.tomato = tomato;
			this.onion = onion;
			this.pickle = pickle;
		}
	}
}
