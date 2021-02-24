
public class Arrays_3 {

	public static void main(String[] args) {

		int matrizRandom[] = new int[100];

		for (int elemento : matrizRandom) {
			
			matrizRandom[elemento] = (int) (Math.round(Math.random() * 100));
			elemento++;

		}

		for (int i = 0; i < matrizRandom.length; i++) {

			System.out.println("Aleatorio " + (i+1) + " = " +  matrizRandom[i]);

		}

	}

}
