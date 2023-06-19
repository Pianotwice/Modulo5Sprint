package grupal.modelo;

/**
 * @author Etzel M. Valderrama
 *
 */
public class Usuario {
	
	protected String run;
	protected String nombre;
	protected String fechaNacimiento;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param run
	 * @param nombre
	 * @param fechaNacimiento
	 */
	public Usuario(String run, String nombre, String fechaNacimiento) {
		super();
		this.run = run;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param run the run to set
	 */
	public void setRun(String run) {
		this.run = run;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Usuario [run=" + run + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}
