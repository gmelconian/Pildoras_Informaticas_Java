
public class Arrays_5_for_each {
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

		for (int[] fila : array_dos_dim) {

			for (int columna : fila) {
				System.out.print(columna + " ");
			}
			System.out.println();

		}
	}
}
