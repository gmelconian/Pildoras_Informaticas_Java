package dominio;

import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Fachada {

	public static void main(String[] args) {

		System.out.println("BIENVENIDO A AUTOMOTORA GAPRIEL");
		// ProgressBar.progressBar();

		Fachada f = new Fachada();
		f.menuPrincipal();

	}

	public void menuPrincipal() {

		int opcion;
		Scanner entrada = new Scanner(System.in);

		System.out.println("\n\tMENU PRINCIPAL\n");
		do {
			System.out.println("1: Listar Autos\n\n2: Agregar Auto\n\n0: Salir");
			System.out.print("Ingrese su opcion: ");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 0: {
				System.out.println("Tamanana");
				break;
			}
			case 1: {
				listarAutos();
				break;
			}
			case 2: {
				agregarAuto();
				break;
			}

			default:
				System.out.println("Opcion invalida");

			}

		} while (opcion != 0);
		entrada.close();

	}

	private void listarAutos() {
		System.out.println("Marca\t\tModelo\t\tNumero de Vin\t\tMotor\t\tRuedas\t\tCon AA\t\tCon Asientos en cuero");

		persistencia.Auto.seleccionarTodos();

	}

	public void agregarAuto() {
		Vehiculo nuevo_auto = new Auto();

		final JDialog dialog = new JDialog();
		dialog.setAlwaysOnTop(true);

		nuevo_auto.set_marca(JOptionPane.showInputDialog(dialog, "Ingrese la marca del auto"));
		nuevo_auto.set_modelo(JOptionPane.showInputDialog(dialog, "Ingrese el modelo del auto"));
		nuevo_auto.setCc_motor(Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingrese la cilindrada del auto")));
		if (JOptionPane.showInternalConfirmDialog(null, "Tiene Aire Acondicionado?") == 0) {
			nuevo_auto.tieneAA();
		}
		if (JOptionPane.showInternalConfirmDialog(null, "Tiene Asientos de cuero?") == 0) {
			nuevo_auto.tieneAsientosDeCuero();
		}
		persistencia.Auto.agregar_auto(nuevo_auto);

	}

}
