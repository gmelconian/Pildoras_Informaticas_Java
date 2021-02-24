
public class Arrays_4_Bidemencionales {

	public static void main(String[] args) {

		int array_dos_dim[][] = new int[4][5];
		int a = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				// array_dos_dim[i][j] = (int) Math.round((Math.random() * 100));

				array_dos_dim[i][j] = a;
				a++;

			}

		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {

				System.out.print(array_dos_dim[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
