
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventosDelTeclado {

	public static void main(String[] args) {

		Marco6 m = new Marco6();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco6 extends JFrame {

	public Marco6() {

		setVisible(true);
		setBounds(300, 300, 500, 350);

		EventoTeclado tecla = new EventoTeclado();
		addKeyListener(tecla);

	}

}

//CREAR LISTENER
class EventoTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println(e.getKeyChar());
		System.out.println(e.getExtendedKeyCode());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getExtendedKeyCode();
		if (e.getKeyCode() == KeyEvent.VK_F2)
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
