import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paneles {

	public static void main(String[] args) {
		MarcoConPanel mp = new MarcoConPanel();
		mp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConPanel extends JFrame {

	public MarcoConPanel() {
		setVisible(true);
		setBounds(200, 200, 600, 400);
		setTitle("Marco");

		Panel p = new Panel();
		add(p);

	}

}

class Panel extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawString("asdfasdfasdf", 100, 100);

	}
}
