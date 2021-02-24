
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class ComprobarPassEnTextField {

	public static void main(String[] args) {
		MarcoTexto2 m = new MarcoTexto2();

		m.setVisible(true);

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

final class MarcoTexto2 extends JFrame {

	public MarcoTexto2() {

		this.setTitle("Ingreso");

		this.setBounds(400, 200, 600, 150);

		this.add(new PanelIngreso());

	}
}

class PanelIngreso extends JPanel {
	JTextField campoEmail;
	JTextField campoPass;
	JLabel email;
	JLabel passCorrecto;

	public PanelIngreso() {
		setLayout(new GridLayout(2, 20));

		JPanel panelEmail = new JPanel();
		panelEmail.setLayout(new FlowLayout(FlowLayout.LEFT));

		email = new JLabel("Ingrese el email: ");

		campoEmail = new JTextField(20);

		JButton boton1 = new JButton("Validar Email");

		DameTexto evento = new DameTexto();

		boton1.addActionListener(evento);

		panelEmail.add(email);

		panelEmail.add(campoEmail);

		panelEmail.add(boton1);

		JPanel panelPass = new JPanel();
		panelPass.setLayout(new FlowLayout(FlowLayout.LEFT));

		campoPass = new JTextField(20);

		passCorrecto = new JLabel("M�s de 8 caracteres, solo letras y numeros");

		EscuchaTexto eventoPass = new EscuchaTexto();

		Document miDoc = campoPass.getDocument();

		miDoc.addDocumentListener(eventoPass);

		panelPass.add(new JLabel("Ingrese el pass:  "));
		panelPass.add(campoPass);
		panelPass.add(passCorrecto);

		this.add(panelEmail, 0);
		this.add(panelPass, 1);
	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (comprobarEmail(campoEmail.getText())) {
				JOptionPane.showMessageDialog(null, "Email Correcto");
			} else {
				JOptionPane.showMessageDialog(null, "Email Incorrecto", "Vejiga", JOptionPane.ERROR_MESSAGE);
			}

		}

		private boolean comprobarEmail(String email) {

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

	private class EscuchaTexto implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			if (comprobarPass(campoPass.getText())) {
				passCorrecto.setText("Password Correcto");
				passCorrecto.setForeground(Color.GREEN);
			} else {
				passCorrecto.setText("Password Incorrecto");
				passCorrecto.setForeground(Color.RED);
			}

		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			if (comprobarPass(campoPass.getText())) {
				passCorrecto.setForeground(Color.GREEN);
				passCorrecto.setText("Password Correcto");

			} else {
				passCorrecto.setForeground(Color.RED);
				passCorrecto.setText("Password Incorrecto");

			}

		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			System.out.println("Algo cambio");

		}

		private boolean comprobarPass(String password) {

			// Password must contain at least one letter, at least one number, and be longer
			// than eigth charaters.

			String rex = "^(?=.*[0-9]+.*)(?=.*[a-zA-Z]+.*)[0-9a-zA-Z]{8,}$";

			Pattern pattern = Pattern.compile(rex);

			Matcher matcher = pattern.matcher(password);

			if (matcher.find()) {
				return true;
			} else {
				return false;
			}

		}
	}
}
