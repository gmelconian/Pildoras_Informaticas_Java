import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class PruebaTemporizador {

	public static void main(String[] args) {

		DameHora listener = new DameHora();
		//Es lo mismo decir:
		//ActionListener listener = new DameHora();

		Timer miTemporizador = new Timer(5000, listener);

		miTemporizador.start();

		JOptionPane.showMessageDialog(null, "Para cortar el timer dale ok");
	}

}

class DameHora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Date now = new Date();

		System.out.println("Hora cada 5 segundos: " + now);

	}

}
