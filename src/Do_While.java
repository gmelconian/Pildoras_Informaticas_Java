import javax.swing.JOptionPane;

public class Do_While {

	public static void main(String[] args) {

		String genero = "";

		do {
			genero = JOptionPane.showInputDialog("Introduzca el Genero (H o M)");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su altura en cm"));

		int peso_ideal = 0;

		if (genero.equalsIgnoreCase("h")) {

			peso_ideal = altura - 110;

		} else {
			peso_ideal = altura - 120;

		}
		System.out.println("Su peso ideal es: " + peso_ideal);

	}

}
