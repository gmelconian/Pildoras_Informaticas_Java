
//Caculo de area de figuras geometricas
import java.util.*;
import javax.swing.*;

public class Switch {

	public static void main(String[] args) {
		int base, altura;

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"Elige una opcion: \n" + "1: Cuadrado\n" + "2: Rectangulo\n" + "3: Triangulo\n" + "4: Circulo");

		int opcion = entrada.nextInt();
		entrada.close();

		switch (opcion) {
		case 1: {
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
		}

		case 2: {
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es " + base * altura);

			break;
		}
		case 3: {

			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es " + (base * altura) / 2);
			break;
		}
		case 4: {
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.print("El area del circulo es: ");
			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));
			break;

		}

		default:
			System.out.println("Unexpected value: " + opcion);
		}

	}

}
