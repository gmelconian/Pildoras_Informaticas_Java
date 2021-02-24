
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Eventos_Botones {

	public static void main(String[] args) {

		Marco4 m = new Marco4();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco4 extends JFrame {

	public Marco4() {

		setTitle("NISSAN");
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		PanelConBotones panel = new PanelConBotones();

		add(panel);

	}

}

class PanelConBotones extends JPanel implements ActionListener {

	JButton boton1 = new JButton("Boton 1");
	JButton boton2 = new JButton("Boton 2");
	JButton boton3 = new JButton("Boton 3");

	public PanelConBotones() {

		add(boton1);
		add(boton2);
		add(boton3);

		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);

	}

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

	@Override
	public void actionPerformed(ActionEvent e) {
		Object botonPulsado = e.getSource();

		if (botonPulsado == boton1)
			JOptionPane.showMessageDialog(null, "Presione el boton 1");
		if (botonPulsado == boton2)
			JOptionPane.showMessageDialog(null, "Presione el boton 2");
		if (botonPulsado == boton3)
			JOptionPane.showMessageDialog(null, "Presione el boton 3");

	}

}
