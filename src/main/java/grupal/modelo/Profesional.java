package grupal.modelo;

import java.time.LocalDate;

/**
 * @author Etzel M. Valderrama
 *
 */
public class Profesional {
	
	private String titulo;
	private LocalDate fechaIngreso;
	
	public Profesional() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titulo
	 * @param fechaIngreso
	 */
	public Profesional(String titulo, LocalDate fechaIngreso) {
		super();
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the fechaIngreso
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}
