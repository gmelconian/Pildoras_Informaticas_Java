package dominio;

public class Camioneta extends Vehiculo {

	private int capacidad_extra;
	private int asientos_extra;

	public Camioneta(String marca, String modelo, int motor, int asientos_extra, int capacidad_extra) {

		super(marca, modelo, 4, motor);

		this.capacidad_extra = capacidad_extra;
		this.asientos_extra = asientos_extra;

	}

	public int getCapacidad_extra() {
		return capacidad_extra;
	}

	public int getAsientos_extra() {
		return asientos_extra;
	}

}
