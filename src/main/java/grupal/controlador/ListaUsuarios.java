package grupal.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupal.modelo.Usuario;

/**
 * Servlet implementation class ListaUsuarios
 */
@WebServlet("/ListaUsuarios")
public class ListaUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// Lista para almacenar las capacitaciones
    private List<Usuario> usuarios;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
        super.init();
        usuarios = new ArrayList<>();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Verificar si el usuario ha iniciado sesión
    	HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
        	// Obtener los datos del formulario
            String run = request.getParameter("run");
            String nombre = request.getParameter("nombre");
            String nacimiento = request.getParameter("nacimiento");

            // Validar si los datos no son nulos
            if (run != null && !run.isEmpty() && nombre != null && !nombre.isEmpty() && nacimiento != null && !nacimiento.isEmpty()) {
                // Crear una instancia de CapacitacionControlador y establecer los datos
                Usuario user = new Usuario();
                user.setRun(run);
                user.setNombre(nombre);
                user.setFechaNacimiento(nacimiento);

                // Agregar la capacitacion a la lista
                usuarios.add(user);
            }
            
            // Establecer la lista de capacitaciones en la solicitud
            request.setAttribute("usuarios", usuarios);
            
    		// Establecer la página específica a incluir en la plantilla
    	    request.setAttribute("contenido", "lista_usuarios.jsp");

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
