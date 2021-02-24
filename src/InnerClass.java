import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;

/*
 * SIRVEN PARA:
 * ACCEDER A LOS CAMPOS PRIVADOS DE UNA CLASE DESDE OTRA
 * PARA OCULTAR UNA CLASE DE OTRAS PERTENECIENTES AL MISMO PAQUETE
 * PARA CREAR CLASES INTERNAS ANONIMAS, UTILES PARA GESTIONAR EVENTOS Y RETROLLAMAS
 * CUANDO SOLO UNA CLASE DEBE ACCEDER A LOS CAMPOS DE EJEMPLAR DE OTRA CLASE
 * 
 * AHORRAS HACER SETTERS Y GETTERS
 */

public class InnerClass {

	public static void main(String[] args) {
		Reloj reloj = new Reloj(1000, true);
		reloj.empezarReloj();
		JOptionPane.showMessageDialog(null, "Para cortar el timer dale ok");

		System.exit(0);

	}
}

class Reloj {

	public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;

	}

	public void empezarReloj() {
		ActionListener listener = new DameHora2();

		Timer temporizador = new Timer(this.intervalo, listener);
		temporizador.start();
	}

	private int intervalo;
	private boolean sonido;

	private class DameHora2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Date now = new Date();

			System.out.println("Hora cada segundo: " + now);
			if (sonido) {
				Toolkit.getDefaultToolkit().beep();
			}

		}

	}
}