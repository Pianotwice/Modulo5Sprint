package grupal.servlets;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Capacitacion
 */
@WebServlet("/Capacitacion")
public class Capacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private List<String> capacitaciones;
	
	@Override
	public void init() throws ServletException {
		super.init();
		capacitaciones = new ArrayList<>();
	}
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Capacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Establecer la página específica a incluir en la plantilla
	    request.setAttribute("contenido", "capacitacion.jsp");
	    
	    // Obtener la lista de capacitaciones y pasarla al JSP
	 	request.setAttribute("capacitaciones", capacitaciones);

	    // Redirigir a la vista
	    request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombreCapacitacion = request.getParameter("name");
		if (nombreCapacitacion != null && !nombreCapacitacion.isEmpty()) {
			// Agregar la capacitación a la lista
			capacitaciones.add(nombreCapacitacion);
		}
		doGet(request, response);
	}
}
