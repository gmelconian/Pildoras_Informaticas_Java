

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dibujos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConDibujos m = new MarcoConDibujos();

		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelConDibujos panel = new PanelConDibujos();
		m.add(panel);
	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {
		// TODO Auto-generated constructor stub

		setTitle("Dibujo 1");
		setSize(400, 400);

	}

}

class PanelConDibujos extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.drawRect(50, 50, 200, 200);
		g.drawLine(50, 50, 250, 250);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rec = new Rectangle2D.Double(100, 100, 200, 150);

		// Ellipse2D el = new Ellipse2D.Double(100,100,200,150);

		Ellipse2D el = new Ellipse2D.Double();
		el.setFrame(rec);

		g2.draw(rec);
		g2.draw(el);

		g2.draw(new Line2D.Double(100, 100, 300, 250));

		double centroEnX = rec.getCenterX();
		double centroEnY = rec.getCenterY();

		double radio = 150;

		Ellipse2D circulo = new Ellipse2D.Double(centroEnX, centroEnY, radio, radio);
		
		g2.draw(circulo);

	}

}