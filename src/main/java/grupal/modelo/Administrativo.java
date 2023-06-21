package grupal.modelo;

public class Administrativo extends Usuario {
	
	private String area;
	private String expPrevia;
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public Administrativo(String run, String nombre, String apellido, String fechaNacimiento) {
		super(run, nombre, apellido, fechaNacimiento);
	}

	public Administrativo(String run, String nombre, String apellido, String fechaNacimiento, String area, String expPrevia) {
		super(run, nombre, apellido, fechaNacimiento);
		this.area = area;
		this.expPrevia = expPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExpPrevia() {
		return expPrevia;
	}

	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}
}