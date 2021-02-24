import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AreasDeTexto_JTextArea {

	public static void main(String[] args) {

		MarcoAreaTexto m = new MarcoAreaTexto();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoAreaTexto extends JFrame {

	public MarcoAreaTexto() {

		this.setBounds(500, 300, 500, 350);

		PanelPrincipal panel = new PanelPrincipal();

		this.add(panel);

		this.setVisible(true);

	}
}

class PanelPrincipal extends JPanel {
	private JTextArea area;

	public PanelPrincipal() {

		area = new JTextArea(8, 20);

		JScrollPane panelAreaTexto = new JScrollPane(area);

		// area.setLineWrap(true);

		add(panelAreaTexto);

		JButton boton = new JButton("OK");

		boton.addActionListener(new GestionaArea());
		
		add(boton);

	}

	private class GestionaArea implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(area.getText());

		}

	}
}
