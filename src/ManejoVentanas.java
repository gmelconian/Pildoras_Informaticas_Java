import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class ManejoVentanas {

	public static void main(String[] args) {

		Marco5 m = new Marco5();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco5 extends JFrame {

	public Marco5() {

		setTitle("NISSAN");
		setBounds(300, 300, 500, 350);

		CambioEstado nuevoEstado = new CambioEstado();

		addWindowStateListener(nuevoEstado);

	}

}

class CambioEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana ha cambiado de estado");

		System.out.println(e.getNewState());

		if (e.getNewState() == JFrame.MAXIMIZED_BOTH)
			System.out.println("Se Maximizo la ventana");

	}

}
