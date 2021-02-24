import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosDelRaton {

	public static void main(String[] args) {

		Marco7 m = new Marco7();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco7 extends JFrame {

	public Marco7() {

		setVisible(true);
		setBounds(300, 300, 500, 350);

		EventoRaton raton = new EventoRaton();
		addMouseListener(raton);

	}

}

class EventoRaton extends MouseAdapter implements MouseMotionListener {

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {

		if (e.getButton() == java.awt.event.MouseEvent.BUTTON2)
			System.out.println("Click Rueda");
		if (e.getButton() == java.awt.event.MouseEvent.BUTTON3)
			System.out.println("Click Derecho");

		System.out.println(e.getClickCount());

	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		System.out.println("Coordenada x: " + e.getX() + "\nCoordenada y: " + e.getY());
		System.out.println(e.getModifiersEx());

	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		System.out.println("Entra a la ventana");

	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		System.out.println("Saliste de la ventana");

	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
		super.mouseDragged(e);
		System.out.println("Estas arrastrando");
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseMoved(e);
	}

}
