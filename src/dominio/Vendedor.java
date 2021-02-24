package dominio;

import java.util.ArrayList;

public class Vendedor extends Empleado implements Trabajadores {

	private ArrayList<Vehiculo> vehiculosVendidos;

	public Vendedor(String nombreUsuario, String password) throws Exception {
		super(nombreUsuario, password);
		vehiculosVendidos = new ArrayList<Vehiculo>();

	}

	public Vendedor(String nombreUsuario, String password, String nombreCompleto) throws Exception {
		super(nombreUsuario, password, nombreCompleto, false);
		vehiculosVendidos = new ArrayList<Vehiculo>();

	}

	public void agregarVenta(Vehiculo v) {
		this.vehiculosVendidos.add(v);
	}

	public ArrayList<Vehiculo> getListaVehiculosVendidos() {
		return this.vehiculosVendidos;
	}

	@Override
	public double estableceBonus(double bonus) {
		// TODO Auto-generated method stub
		return Trabajadores.bonus_base + (bonus * 110 / 100);
	}

}
