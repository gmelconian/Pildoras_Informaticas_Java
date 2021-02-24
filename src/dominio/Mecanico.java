package dominio;

import java.util.ArrayList;

@SuppressWarnings("rawtypes")
public class Mecanico extends Empleado implements Comparable, Trabajadores {

	private String _nombre;
	private ArrayList<Vehiculo> _vehiculosArreglados;
	private int _sueldo;

	public Mecanico(final String nombreUsuario, final String password, final String nombreCompleto) throws Exception {
		super(nombreUsuario, password, nombreCompleto, false);

		this._vehiculosArreglados = new ArrayList<Vehiculo>();
	}

	public String get_nombre() {
		return _nombre;

	}

	public ArrayList<Vehiculo> get_vehiculosArreglados() {
		return _vehiculosArreglados;
	}

	public void agregarVehiculoArreglado(Vehiculo v) {
		this._vehiculosArreglados.add(v);

	}

	public int get_sueldo() {
		return _sueldo;
	}

	public void set_sueldo(int sueldo) {
		this._sueldo = sueldo;
	}

	public void aumentarSueldo(int porcentaje) {
		this._sueldo = this._sueldo * porcentaje / 100;

	}

	@Override
	public int compareTo(Object o) {

		Mecanico m = (Mecanico) o;

		if (this._vehiculosArreglados.size() < m.get_vehiculosArreglados().size()) {
			return -1;
		}
		if (this._vehiculosArreglados.size() > m.get_vehiculosArreglados().size()) {
			return 1;
		}

		return 0;
	}

	@Override
	public double estableceBonus(double bonus) {

		return Trabajadores.bonus_base + bonus;
	}

}
