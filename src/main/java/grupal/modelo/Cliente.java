package grupal.modelo;

/**
 * @author Etzel M. Valderrama
 *
 */
public class Cliente {
	
	private int edad;
	private String afp;
	private String direccion;
	private String comuna;
	private String telefono;
	private int sistemaSalud; // 1 para Fonasa, 2 para Isapre
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param edad
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public Cliente(int edad, String afp, String direccion, String comuna, String telefono, int sistemaSalud) {
		super();
		this.edad = edad;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the afp
	 */
	public String getAfp() {
		return afp;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @return the sistemaSalud
	 */
	public int getSistemaSalud() {
		return sistemaSalud;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param afp the afp to set
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @param sistemaSalud the sistemaSalud to set
	 */
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", afp=" + afp + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", telefono=" + telefono + ", sistemaSalud=" + sistemaSalud + "]";
	}
}
