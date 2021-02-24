package dominio;

public class Auto extends Vehiculo {


	public Auto(String marca, String modelo, int motor, boolean asientosDeCuero, boolean aire_Acondicionado) {
		super(marca, modelo, 4, motor);
		this._aire_acondicionado = aire_Acondicionado;
		this._asientos_cuero = asientosDeCuero;

	}

	public Auto() {
		super("", "", 4, 0);
		
	}

	public boolean get_tieneAA() {
		return _aire_acondicionado;
	}

	public boolean get_tieneAsientosDeCuero() {
		return _asientos_cuero;
	}
	
	public void tieneAA() {
		this._aire_acondicionado = true;
		
	}

}
