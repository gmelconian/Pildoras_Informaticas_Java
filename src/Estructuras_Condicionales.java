import java.util.*;

public class Estructuras_Condicionales {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu edad: ");

		int edad = entrada.nextInt();

		if (edad >= 18) {
			System.out.println("Sos mayor de edad, sabe");

		} else {
			System.out.println("Sos menor gil");
		}

		entrada.close();
	}

}
