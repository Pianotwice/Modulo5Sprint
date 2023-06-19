/**
 * 
 */
package grupal.modelo;

/**
 * @author Etzel M. Valderrama
 *
 */
public class Administrativo {
	
	private String area;
	private String expPrevia;
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param area
	 * @param expPrevia
	 */
	public Administrativo(String area, String expPrevia) {
		super();
		this.area = area;
		this.expPrevia = expPrevia;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @return the expPrevia
	 */
	public String getExpPrevia() {
		return expPrevia;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @param expPrevia the expPrevia to set
	 */
	public void setExpPrevia(String expPrevia) {
		this.expPrevia = expPrevia;
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", expPrevia=" + expPrevia + "]";
	}
}
