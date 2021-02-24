import javax.swing.JOptionPane;

public class Bucle_For {

	public static void main(String[] args) {

		boolean arroba = false;

		String mail = JOptionPane.showInputDialog("Introduzca su mail");

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				arroba = true;
			}

		}
		if (arroba) {
			System.out.println("Su mail es correcto");
		} else {
			System.out.println("Su mail es incorrecto");
		}

	}

}
