
public class Arrays_1 {

	public static void main(String[] args) {

		// Sintaxis:

		// int[] matriz_enteros = new int[5];
		int[] matriz_enteros = { 5, 10, 6, 8, 9 };
		String[] matriz_strings = new String[] { "hola", "como", "estas" };

		// for (int i = 0; i < matriz_enteros.length; i++) {
		// matriz_enteros[i] = i + 1;

		// }
		for (

				int i = 0; i < matriz_enteros.length; i++) {
			System.out.println(matriz_enteros[i]);
		}
		for (int i = 0; i < matriz_strings.length; i++) {
			System.out.print(matriz_strings[i] + " ");

		}
	}
}
