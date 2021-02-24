import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextField {

	public static void main(String[] args) {
		MarcoTexto m = new MarcoTexto();

		m.setVisible(true);

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

final class MarcoTexto extends JFrame {

	public MarcoTexto() {

		// ME FALTO EL TITULO
		this.setTitle("Text Field");

		this.setBounds(400, 200, 500, 600);

		this.add(new PanelTexto());

	}
}

class PanelTexto extends JPanel {
	JTextField campo1;
	JLabel email;

	public PanelTexto() {
		setLayout(new BorderLayout());
		
		JPanel panelTexto2 = new JPanel();
		panelTexto2.setLayout(new FlowLayout());
		

		email = new JLabel("Ingrese el email: ");

		campo1 = new JTextField(20);

		JButton boton1 = new JButton("Validar Email");

		DameTexto evento = new DameTexto();

		boton1.addActionListener(evento);

		panelTexto2.add(email);

		panelTexto2.add(campo1);

		panelTexto2.add(boton1);
		
		this.add(panelTexto2, BorderLayout.NORTH);
	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (comprobarEmail(campo1.getText())) {
				JOptionPane.showMessageDialog(null, "Email Correcto");
			} else {
				JOptionPane.showMessageDialog(null, "Email Incorrecto", "Vejiga", JOptionPane.ERROR_MESSAGE);
			}

		}

		public boolean comprobarEmail(String email) {

			String re = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";

			Pattern pattern = Pattern.compile(re);

			Matcher matcher = pattern.matcher(email);

			if (matcher.find()) {
				return true;
			} else {
				return false;
			}

		}

	}

}
