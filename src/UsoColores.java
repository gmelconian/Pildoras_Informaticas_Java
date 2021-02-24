

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class UsoColores {

	public static void main(String[] args) {

		MarcoConColores m = new MarcoConColores();

		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelConColores panel = new PanelConColores();
		panel.setBackground(Color.blue);
		m.add(panel);

	}

}

class MarcoConColores extends JFrame {

	public MarcoConColores() {

		setTitle("Elipse con Color Rojo");
		setSize(400, 400);

	}

}

class PanelConColores extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rec = new Rectangle2D.Double(100, 100, 200, 150);

		g2.setPaint(Color.BLACK);

		g2.fill(rec);

		Ellipse2D el = new Ellipse2D.Double();
		el.setFrame(rec);
		g2.setPaint(new Color(24, 245, 30).brighter().darker());

		g2.fill(el);

		// USO DE FUENTES
		Font miFuente = new Font("Arial", Font.BOLD, 30);
		g2.setColor(Color.ORANGE);
		g2.setFont(miFuente);
		g2.drawString("Gabriel", 100, 100);

	}

}