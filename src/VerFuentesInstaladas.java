import java.awt.GraphicsEnvironment;

public class VerFuentesInstaladas {

	public static void main(String[] args) {

		String[] fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for (String string : fuentes) {
			System.out.println(string);
		}

	}

}
