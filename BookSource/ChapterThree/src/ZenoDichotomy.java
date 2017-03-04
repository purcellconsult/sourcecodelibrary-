/****************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* Zeno's dichotomy first 10 terms:  
* 
* 1/2,1/4,1/8,1/16,1/32,1/64,1/128,1/256,1/512,1/1024
*
******************************************/

public class ZenoDichotomy {

	public static void main(String[] args) {
		int i = 1;
		int num = 1;
		while (true) {
			i *= 2;
			System.out.println(num + "/" + i);
			if (i == 1024)
				break;
		}
	}
}
