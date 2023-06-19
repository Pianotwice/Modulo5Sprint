package grupal01.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExitoContacto
 */
@WebServlet("/ExitoContacto")
public class ExitoContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExitoContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	// Obtener los datos del formulario
        String nombre = request.getParameter("name");
        String email = request.getParameter("email");
        String mensaje = request.getParameter("message");

        // Establecer los atributos en la solicitud
        request.setAttribute("nombre", nombre);
        request.setAttribute("email", email);
        request.setAttribute("mensaje", mensaje);
        
     // Establecer la página específica a incluir en el template.jsp
	    request.setAttribute("contenido", "exito_contacto.jsp");

	    // Redirigir a la vista
	    request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}