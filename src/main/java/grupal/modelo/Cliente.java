package grupal.modelo;

public class Cliente extends Usuario {
	
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
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 */
	public Cliente(int id, String run, String nombre, String apellido, String fechaNacimiento) {
		super(id, run, nombre, apellido, fechaNacimiento);
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
	 * @param id
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param edad
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public Cliente(int id, String run, String nombre, String apellido, String fechaNacimiento, int edad, String afp,
			String direccion, String comuna, String telefono, int sistemaSalud) {
		super(id, run, nombre, apellido, fechaNacimiento);
		this.edad = edad;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	/**
	 * @param run
	 * @param nombre
	 * @param apellido
	 * @param fechaNacimiento
	 * @param edad
	 * @param afp
	 * @param direccion
	 * @param comuna
	 * @param telefono
	 * @param sistemaSalud
	 */
	public Cliente(String run, String nombre, String apellido, String fechaNacimiento, int edad, String afp,
			String direccion, String comuna, String telefono, int sistemaSalud) {
		super(run, nombre, apellido, fechaNacimiento);
		this.edad = edad;
		this.afp = afp;
		this.direccion = direccion;
		this.comuna = comuna;
		this.telefono = telefono;
		this.sistemaSalud = sistemaSalud;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	@Override
	public String toString() {
		return "Cliente [edad=" + edad + ", afp=" + afp + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", telefono=" + telefono + ", sistemaSalud=" + sistemaSalud + "]";
	}
}