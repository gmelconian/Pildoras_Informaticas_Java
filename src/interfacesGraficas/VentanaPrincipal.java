package interfacesGraficas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaPrincipal {

	public static void main(String[] args) {

		Marco m = new Marco();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PanelConImagen panel = new PanelConImagen();

		m.add(panel);

	}

}

class Marco extends JFrame {

	public Marco() {

		setTitle("NISSAN");
		setExtendedState(JFrame.MAXIMIZED_BOTH);

	}

}

class PanelConImagen extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		setBackground(new Color(159, 0, 0));

		Image fondo = null;
		Image icon = null;

		File file = null;

		try {
			file = new File("Imagenes/MotorNissan.jpg");
			fondo = ImageIO.read(file);
			file = new File("Imagenes/IconoNissan.png");
			icon = ImageIO.read(file);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		for (int i = 0; i < 1800; i += 134) {
			for (int j = 0; j < 800; j += 128) {
				g.drawImage(icon, i, j, null);
			}
		}
		g.drawImage(fondo, icon.getHeight(null), icon.getWidth(null) - 15, null);
	}

}
