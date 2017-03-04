
public class CanineTest {

	public static void main(String[] args) {
		Canine africanDog = new AfricanWildDog();
		africanDog.getHabitat();
		System.out.println(africanDog.doBark());
		africanDog.lifeSpan();
		System.out.println(africanDog.haveCanineTeeth());
		System.out.println("-----");
		Canine coyote = new Coyote();
		coyote.getHabitat();
		System.out.println(coyote.doBark());
		coyote.lifeSpan();
		System.out.println("-----");
		Canine basenji = new Basenji();
		basenji.getHabitat();
		System.out.println(basenji.doBark());
		basenji.lifeSpan();
		System.out.println(basenji.numOfLegs);
	}
}
