
public abstract class Options {

	protected double cookTime;

	public void cancel() {
		this.cookTime = 0;
	}

	public void viewCookTime() {
		System.out.println(cookTime);
	}

	protected String turnTable(int button) {
		String state = "";
		if (button != 0 || button != 1)
			state = "enter valid input";
		if (button == 0) {
			state = "off";
		} else if (button == 1) {
			state = "on";
		}
		return state;
	}

	protected String surfaceLight(String button) {
		String state = "";
		if (button == "on") {
			state = "on";
		} else if (button == "off") {
			state = "off";
		}
		return state;
	}
}
