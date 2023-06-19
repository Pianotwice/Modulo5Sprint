package grupal.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Establecer la página específica a incluir en la plantilla
	    request.setAttribute("contenido", "login.jsp");

	    // Redirigir a la vista
	    request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Obtener los datos del formulario de inicio de sesión
        String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");

        // Validar las credenciales de inicio de sesión (ejemplo: usuario=admin, contrasena=admin)
        if (usuario.equals("admin") && contrasena.equals("1234")) {
            // Iniciar sesión estableciendo un atributo en la sesión
            HttpSession session = request.getSession();
            session.setAttribute("usuario", usuario);

            // Redirigir a la página de inicio después del inicio de sesión exitoso
            response.sendRedirect("Index");
        } else {
            // Las credenciales son incorrectas, redirigir al formulario de inicio de sesión nuevamente
            response.sendRedirect("Login");
        }
	}
}
