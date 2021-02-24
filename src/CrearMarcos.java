

import java.awt.Frame;

import javax.swing.*;

public class CrearMarcos {

	public static void main(String[] args) {

		MiMarco marco1 = new MiMarco();

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MiMarco extends JFrame {

	public MiMarco() {

		// setSize(500, 300);
		setVisible(true);
		setLocation(0, 0);
		//setBounds(500, 300, 250, 250);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setTitle("Mecanica Gabriel");
		
	}
}
