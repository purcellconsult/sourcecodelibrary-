/***************************************
*
* @author: Doug Purcell 
* website: http://www.purcellconsult.com
* 
* This program shows how to convert the w = m x g formula 
* into Java. 
*
*****************************************/

public class Gravity {
	public static void main(String[] args) {
		double weight = 0;
		double mass = 6;
		double gravity = 9.8;
		weight = mass * gravity;
		System.out.println(weight + " newtons");
	}
}
