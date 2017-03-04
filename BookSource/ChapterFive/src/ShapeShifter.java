public class ShapeShifter {
		
	public static void main(String [] args) {
		Triangle per = new Triangle();
		per.setPerimeter(10.0, 20., 30.0);
		System.out.println("The perimeter of triangle is " + per.perimeter());
		Triangle area = new Triangle();
		area.setArea(20, 50);
		System.out.println("The area of a traingle is " + area.area());
		Square sq = new Square(5);
		System.out.println("The perimeter of a square is " + sq.perimeter());
		sq.area();
		System.out.println("The area of a square is " + sq.area());
		Parallelogram par = new Parallelogram();
		par.setPerimeter(7.5,8.1);
		System.out.println("The perimeter of the Parallelogram is " + par.perimeter());
		par.setArea(11.3, 9.9282);
		System.out.println("The area of the Parallelogram is " + par.area());	
	}	
}
