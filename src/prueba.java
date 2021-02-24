import java.util.Scanner;

import javax.swing.JOptionPane;

//Import se usa cuando vamos a utilizar un paquete que no sea java.lang

public class prueba {

	public static void main(String[] args) {

		String path = JOptionPane.showInputDialog("Intoduzca el path del archivo");
		Scanner archivo = new Scanner(path);
		Scanner entrada = new Scanner(System.in);
		System.out.println(archivo.toString());

		System.out.println("Ingrese su edad: 5");
		int edad = entrada.nextInt();
		System.out.println(edad);

		archivo.close();
		entrada.close();

	}

}
