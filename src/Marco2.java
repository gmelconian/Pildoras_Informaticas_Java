

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Marco2 {

	public static void main(String[] args) {

		Marco m = new Marco();

		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame {

	public Marco() {
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = miPantalla.getScreenSize();
		setSize(tamanoPantalla.width, tamanoPantalla.height-10);
		setExtendedState(NORMAL);
		setResizable(false);
		setAlwaysOnTop(false);
		setTitle("Hola");
		
		
	}

}
