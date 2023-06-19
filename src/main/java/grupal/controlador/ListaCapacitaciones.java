package grupal.controlador;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupal.modelo.Capacitacion;

/**
 * Servlet implementation class ListaCapacitaciones
 */
@WebServlet("/ListaCapacitaciones")
public class ListaCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Lista para almacenar las capacitaciones
    private List<Capacitacion> capacitaciones;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
        capacitaciones = new ArrayList<>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Verificar si el usuario ha iniciado sesión
    	HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
        	// Obtener los datos del formulario
            String nombre = request.getParameter("name");
            String horario = request.getParameter("time");
            String fecha = request.getParameter("date");

            // Validar si los datos no son nulos
            if (nombre != null && !nombre.isEmpty() && horario != null && !horario.isEmpty() && fecha != null && !fecha.isEmpty()) {
                // Crear una instancia de CapacitacionControlador y establecer los datos
                Capacitacion capacitacion = new Capacitacion();
                capacitacion.setNombre(nombre);
                capacitacion.setHorario(horario);
                capacitacion.setFecha(fecha);

                // Agregar la capacitacion a la lista
                capacitaciones.add(capacitacion);
            }
            
            // Establecer la lista de capacitaciones en la solicitud
            request.setAttribute("capacitaciones", capacitaciones);
            
    		// Establecer la página específica a incluir en la plantilla
    	    request.setAttribute("contenido", "lista_capacitaciones.jsp");

    	    // Redirigir a la vista
    	    request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
        } else {
            // Si el usuario no ha iniciado sesión, redirigir al formulario de inicio de sesión
            response.sendRedirect("Login");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
