package dominio;

public abstract class Empleado {
	protected String userName;
	protected String fullName;
	protected String password;
	private boolean isJefe;

	/**
	 * Contructor Empleado
	 * 
	 * @param nombreUsuario
	 * @param password
	 * @param nombreCompleto
	 * @throws DatosIncorrectosException
	 */
	public Empleado(final String nombreUsuario, final String password, final String nombreCompleto, boolean isJefe)
			throws Exception {
		setUserName(nombreUsuario);
		setPassword(password);
		setFullName(nombreCompleto);
		setJefe(isJefe);

	}

	public Empleado(final String nombreUsuario, final String password) throws Exception {
		setUserName(nombreUsuario);
		setPassword(password);
	}

	/**
	 * @return the userName
	 */
	public final String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 * @throws NombreUsuarioException
	 * @throws DatosIncorrectosException
	 */
	public final void setUserName(final String userName) throws Exception {
		if (userName.isEmpty()) {
			throw new Exception("El nombre esta vacio");
		} else {
			this.userName = userName;
		}

	}

	/**
	 * @return the fullName
	 */
	public final String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public final void setFullName(final String fullName) {

		this.fullName = fullName;

	}

	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public final void setPassword(final String password) {
		this.password = password;
	}

	/**
	 * @param isJefe the isJefe to set
	 */
	private void setJefe(boolean isJefe) {
		this.isJefe = isJefe;
	}

	/**
	 * @return the isJefe
	 */
	public boolean isJefe() {
		return isJefe;
	}

	@Override
	public String toString() {
		return getFullName();
	}

	@Override
	public boolean equals(final Object obj) {
		return getUserName().equals(((Empleado) obj).getUserName());
	}

	@Override
	public int hashCode() {
		return super.hashCode();

	}

}