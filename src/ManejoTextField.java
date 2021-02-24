import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManejoTextField {

	public static void main(String[] args) {

		Marco8 m = new Marco8();

		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco8 extends JFrame {

	public Marco8() {

		setVisible(true);
		setBounds(300, 300, 500, 350);
		this.add(new Panel8());

	}

}

class Panel8 extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		setLayout(null);

		cuadro1 = new JTextField();
		cuadro2 = new JTextField();

		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		add(cuadro1);
		add(cuadro2);

		LanzaFocos lf = new LanzaFocos();
		cuadro1.addFocusListener(lf);

	}

	JTextField cuadro1;
	JTextField cuadro2;

	private class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void focusLost(FocusEvent e) {
			String email = cuadro1.getText();

			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@')
					System.out.println("Es correcto");
			}

		}

	}

}