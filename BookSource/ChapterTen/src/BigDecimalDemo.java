import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

	public static void main(String[] args) {
		BigDecimal[] a = new BigDecimal[5];
		a[0] = new BigDecimal(262);
		a[1] = new BigDecimal(7363);
		a[2] = new BigDecimal(362.3839);
		a[3] = new BigDecimal(383837.38393);
		a[4] = new BigDecimal(36732.83838);

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i].multiply(new BigDecimal(2)).setScale(2, RoundingMode.HALF_UP);
			System.out.println(a[i]);
		}

	}
}
