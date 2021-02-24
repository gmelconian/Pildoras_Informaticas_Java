import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class ClaseAction {

	public static void main(String[] args) {

		MarcoAction m = new MarcoAction();
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);

	}

}

class MarcoAction extends JFrame {

	public MarcoAction() {

		setBounds(400, 200, 600, 400);
		setTitle("MarcoAction");

		PanelAction p = new PanelAction();
		add(p);

	}

}

class PanelAction extends JPanel {

	public PanelAction() {

		ActionColor accionAmarillo = new ActionColor("Amarillo", new ImageIcon("Imagenes/IconoAmarillo.gif"),
				Color.YELLOW);

		ActionColor accionAzul = new ActionColor("Azul", new ImageIcon("Imagenes/IconoAzul.gif"), Color.BLUE);

		ActionColor accionRojo = new ActionColor("Rojo", new ImageIcon("Imagenes/IconoRojo.png"), Color.RED);

		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));

		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl Y");
		KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl B");
		KeyStroke teclaRojo = KeyStroke.getKeyStroke("ctrl R");

		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		mapaEntrada.put(teclaAzul, "fondo_azul");
		mapaEntrada.put(teclaRojo, "fondo_rojo");

		ActionMap mapaAccion = getActionMap();

		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);

	}

	private class ActionColor extends AbstractAction {

		public ActionColor(String nombre, Icon icono, Color colorBoton) {

			putValue(Action.NAME, nombre);

			putValue(Action.SMALL_ICON, icono);

			putValue(Action.SHORT_DESCRIPTION, "Poner el panel de color: " + nombre);

			putValue("colorDeFondo", colorBoton);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
			Color c = (Color) getValue("colorDeFondo");
			setBackground(c);

			System.out.println("Nombre: " + getValue(Action.NAME));

		}

	}
}
