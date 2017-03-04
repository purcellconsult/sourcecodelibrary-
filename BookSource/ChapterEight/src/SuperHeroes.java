import java.util.ArrayList;

public class SuperHeroes {
	public static void main(String[] args) {
		ArrayList<String> superHero = new ArrayList<String>();
		superHero.add("Superman");
		superHero.add("Batman");
		superHero.add("Spider-Man");
		superHero.add("Hal Jordan");
		superHero.add("Wonder Woman");
		superHero.add("Martian Manhunter");
		
		for(int i = 0; i < superHero.size(); i++) {
			String result = superHero.get(i);
			System.out.println(result);
		}

	}
}
