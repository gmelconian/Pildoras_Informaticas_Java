package dominio;

import java.util.Random;

@SuppressWarnings("rawtypes")
public abstract class Vehiculo implements Comparable {

	private int _ruedas, _cc_motor, _peso_chasis;
	private String _marca;
	private String _modelo;
	private String _vinNumber;
	protected boolean _aire_acondicionado;
	protected boolean _asientos_cuero;

	public Vehiculo(String marca, String modelo, int ruedas, int motor) {

		set_marca(marca);
		set_modelo(modelo);
		setRuedas(ruedas);
		setCc_motor(motor);
		double f = Math.random() / Math.nextDown(1.0);
		double x = 500 * (1.0 - f) + 1000 * f;
		setPeso_chasis((int) Math.round(x));
		this._vinNumber = generarVin();

	}

	public String get_marca() {
		return _marca;
	}

	public int getRuedas() {
		return _ruedas;
	}

	public int getCc_motor() {
		return _cc_motor;
	}

	public int getPeso_chasis() {
		return this._peso_chasis;
	}

	public String get_vinNumber() {
		return _vinNumber;
	}
	public boolean get_tieneAA() {
		return _aire_acondicionado;
	}
	public boolean get_tieneAsientosDeCuero() {
		return _asientos_cuero;
	}
	
	

	public void setCc_motor(int cc_motor) {
		this._cc_motor = cc_motor;
	}

	public void setRuedas(int ruedas) {
		this._ruedas = ruedas;
	}

	public void setPeso_chasis(int peso_chasis) {
		this._peso_chasis = peso_chasis;
	}

	public void set_marca(String _marca) {
		this._marca = _marca;
	}

	public String get_modelo() {
		return _modelo;
	}

	public void set_modelo(String _modelo) {
		this._modelo = _modelo;
	}

	private String generarVin() {

		byte primerNro = (byte) Math.round(Math.random() * 10);
		String primeraCadena = generarCadenaStringRandom(10);
		int ultimosNros = (int) Math.round(Math.random() * 1000000);

		return primerNro + primeraCadena + ultimosNros;

	}

	private String generarCadenaStringRandom(int largoCadena) {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = largoCadena;
		Random random = new Random();

		String generatedString = random.ints(leftLimit, rightLimit + 1).limit(targetStringLength)
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

		return generatedString.toUpperCase();

	}
	protected void tieneAA() {
		_aire_acondicionado = true;
	}

	protected void tieneAsientosDeCuero() {
		_asientos_cuero = true;
	}

	@Override
	public int compareTo(Object objeto) {
		Vehiculo otroVehiculo = (Vehiculo) objeto;

		if (this._vinNumber.compareTo(otroVehiculo.get_vinNumber()) < 1) {
			return -1;
		} else if (this._vinNumber.compareTo(otroVehiculo.get_vinNumber()) > 1) {
			return 1;
		} else {
			return 0;
		}

	}

}
