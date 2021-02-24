import java.util.*;

public class Adivina_Numero {

	public static void main(String[] args) {

		// System.out.println(Math.round(Math.random()*100));

		int aleatorio = (int) (Math.random() * 100);
		// System.out.println(aleatorio);

		Scanner entrada = new Scanner(System.in);

		int nro = 0;

		int intentos = 0;

		while (nro != aleatorio) {
			intentos++;

			System.out.print("Introduce un numero: ");
			nro = entrada.nextInt();
			
			if(aleatorio<nro) {
				System.out.println("El numero introducido es más alto que el aleatorio");
				
			}else if(aleatorio>nro) {
				System.out.println("El numero introducido es más bajo que el aleatorio");
				
				
			}else {
				System.out.println("El número es correcto");
				System.out.println("Los intentos consumidos fueron: " + intentos);
				
				
			}

		}
		entrada.close();

	}

}
