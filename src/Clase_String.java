
public class Clase_String {
	public static void main(String[] args) {

		String mi_nombre = "Gabriel Melconian";
		int cant_char = mi_nombre.length();
		String mi_email = "asdf@asdf.com";
		char charAt = mi_nombre.charAt(0);
		boolean es_igual = mi_nombre.equals(mi_email);

		System.out.println("Mi nombre es " + mi_nombre + "\nMi email es:\t" + mi_email
				+ "\nMi mail es igual a mi nombre? " + es_igual + "\nMi nombre tiene " + cant_char + " caracteres");
		System.out.println("La primera letra de mi nombre es: " + charAt);

		System.out.println("La ultima letra de mi nombre es: " + mi_nombre.charAt(mi_nombre.length() - 1));

		String nombre = mi_nombre.substring(0, mi_nombre.indexOf(" "));
		System.out.println("Solo mi nombre es: " + nombre);

		String apellido = mi_nombre.substring(mi_nombre.indexOf(" ")+1, mi_nombre.length());
		System.out.println("Solo mi apellido es: " + apellido);

	}

}
