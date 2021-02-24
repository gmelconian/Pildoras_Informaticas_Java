import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_Calculadora {

	public static void main(String[] args) {

		MarcoCalc calculadora = new MarcoCalc();
		calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCalc extends JFrame {

	public MarcoCalc() {

		this.setTitle("Calculadora");
		setVisible(true);
		setBounds(500, 300, 450, 300);

		this.add(new PanelCalc());
		// pack(); //El marco se tiene que adaptar al tamano por defecto que hay en su
		// interior por ejemplo a los botones

	}

}

class PanelCalc extends JPanel {

	private JPanel pantallaNros;
	private JButton pantalla;
	private double resultado;
	private String ultimaOp;

	public PanelCalc() {

		setLayout(new BorderLayout());

		pantalla = new JButton("0");
		pantalla.setEnabled(false);

		this.add(pantalla, BorderLayout.NORTH);

		pantallaNros = new JPanel();
		pantallaNros.setLayout(new GridLayout(4, 4));

		ActionListener ins = new InsertaNro();
		ActionListener op = new InsertaOp();

		ponerBoton("7", ins);
		ponerBoton("8", ins);
		ponerBoton("9", ins);
		ponerBoton("/", op);
		ponerBoton("4", ins);
		ponerBoton("5", ins);
		ponerBoton("6", ins);
		ponerBoton("x", op);
		ponerBoton("1", ins);
		ponerBoton("2", ins);
		ponerBoton("3", ins);
		ponerBoton("-", op);
		ponerBoton(".", ins);
		ponerBoton("0", ins);
		ponerBoton("=", op);
		ponerBoton("+", op);

		this.add(pantallaNros);

	}

	private void ponerBoton(String rotulo, ActionListener e) {
		JButton boton = new JButton(rotulo);
		boton.addActionListener(e);

		pantallaNros.add(boton);

	}

	private class InsertaNro implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada = e.getActionCommand();
			if (pantalla.getText().equals("0")) {
				pantalla.setText(entrada);
			} else {

				pantalla.setText(pantalla.getText() + entrada);
			}

		}

	}

	private class InsertaOp implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion = e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()), operacion);
			System.out.println(resultado);
			ultimaOp = operacion;

		}

		public void calcular(double x, String op) {
			switch (op) {
			case "+": {
				resultado += x;
				pantalla.setText("0");
				break;

			}
			case "-": {
				resultado = resultado - x;
				pantalla.setText("0");
				break;
			}
			case "/": {

				// TODO hacer if en caso que nro1 no sea 0
				resultado = resultado / x;
				pantalla.setText("0");
				break;
			}
			case "x": {
				resultado = resultado * x;
				pantalla.setText("0");
				break;
			}
			case "=": {
				calcular(x, ultimaOp);
				pantalla.setText(Double.toString(resultado));
				break;

			}

			}
		}
	}
}