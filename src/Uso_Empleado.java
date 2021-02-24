

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string.toString());
		}

		/*
		 * Empleado empleado1 = new Empleado("Gabriel", 25000, 1, 8, 2020); Empleado
		 * empleado2 = new Empleado("Camila", 45000, 1, 2, 2019); Empleado empleado3 =
		 * new Empleado("Jose", 25000, 1, 5, 2015);
		 * 
		 * empleado1.set_sueldo(5); empleado2.set_sueldo(10); empleado3.set_sueldo(0);
		 * 
		 * System.out.println(empleado1.get_nombre() + "\n" + empleado1.get_sueldo() +
		 * "\n" + empleado1.get_fecha_ingreso());
		 * System.out.println(empleado2.get_nombre() + "\n" + empleado2.get_sueldo()); }
		 */
		Empleado[] listaEmpleados = new Empleado[4];

		listaEmpleados[0] = new Empleado("Gabriel", 25000, 1, 8, 2020);
		listaEmpleados[1] = new Empleado("Camila", 45000, 1, 2, 2019);
		listaEmpleados[2] = new Empleado("Jose", 25000, 1, 5, 2015);
		listaEmpleados[3] = new Empleado("Juan");
		

		for (Empleado empleado : listaEmpleados) {
			empleado.set_sueldo(20);

		}

		for (Empleado empleado : listaEmpleados) {

			System.out.println(empleado.get_id() + " " + empleado.get_nombre() + "\n" + empleado.get_sueldo() + "\n"
					+ empleado.get_fecha_ingreso());

		}

	}

}

class Empleado {

	private final String _nombre;

	private Date _fecha_ingreso;

	private int _id;

	private static int contador_id = 1;

	private int _sueldo;

	public Empleado(String nombre, int sueldo, int dia, int mes, int ano) {
		GregorianCalendar calendario = new GregorianCalendar(ano, mes - 1, dia);

		this._fecha_ingreso = calendario.getTime();
		this._nombre = nombre;
		this._sueldo = sueldo;
		this._id = Empleado.contador_id++;

	}

	public Empleado(String nombre) {
		this(nombre, 15000, 1, 1, 1900);
	}

	public int get_id() {
		return this._id;
	}

	public String get_nombre() {
		return _nombre;
	}

	public int get_sueldo() {
		return _sueldo;
	}

	public Date get_fecha_ingreso() {
		return _fecha_ingreso;
	}

	public void set_sueldo(double porcentage) {
		double aumento = this._sueldo * porcentage / 100;
		this._sueldo += (int) aumento;
	}

}
