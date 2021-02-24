import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocosDeVentana extends JFrame implements WindowFocusListener {

	FocosDeVentana marco1;
	FocosDeVentana marco2;

	public static void main(String[] args) {
		FocosDeVentana f = new FocosDeVentana();
		f.inicio();

	}

	public void inicio() {
		marco1 = new FocosDeVentana();
		marco2 = new FocosDeVentana();

		marco1.setVisible(true);
		marco2.setVisible(true);

		marco1.setBounds(200, 100, 600, 350);
		marco2.setBounds(800, 100, 600, 350);

		marco1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		if (e.getSource()==marco1) marco1.setTitle("Tengo Foco");
		if (e.getSource()==marco2) marco2.setTitle("Tengo Foco");
		

	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if (e.getSource()==marco1) marco1.setTitle("");
		if (e.getSource()==marco2) marco2.setTitle("");
		

	}

}
