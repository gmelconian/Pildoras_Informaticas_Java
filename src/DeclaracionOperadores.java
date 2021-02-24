
public class DeclaracionOperadores {

	public static void main(String[] args) {

		int a = 5;

		int b;

		b = 7;

		int c = b + a;

		System.out.println(c);

		c++;
		c += 2;

		System.out.println(c);

		c--;
		c -= 3;

		System.out.println(c);

		double d = (double) b / (double) a;
		final float e = (float) b / (float) a;
		// e = 0; The final local variable e cannot be assigned. It must be blank and
		// not using a compound assignment
		
		System.out.println(d);
		System.out.println(e);
	}

}
