import javax.swing.*;

public class Bucles {
	public static void main(String[] args) {

		String clave_Correcta = "0702";

		String pass = "";

		// TODO IMPORTANTE: equals de la clase String compara cadenas de texto.
		while (clave_Correcta.equals(pass) == false) {

			pass = JOptionPane.showInputDialog("Introduce la contrasena: ");

			if (clave_Correcta.equals(pass) == false) {
				System.out.println("Contraseña incorrecta.");

			}

		}
		System.out.println("Contraseña correcta. Acceso permitido!");

	}

}
