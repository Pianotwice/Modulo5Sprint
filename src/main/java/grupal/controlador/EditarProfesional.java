package grupal.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupal.conexion.UsuarioDAO;
import grupal.modelo.Profesional;
import grupal.modelo.Usuario;

/**
 * Servlet implementation class EditarProfesional
 */
@WebServlet("/EditarProfesional")
public class EditarProfesional extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarProfesional() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Verificar si el usuario ha iniciado sesión
        HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            // Obtener el parámetro "run" de la solicitud
        	int idProfesional = Integer.parseInt(request.getParameter("id"));

            // Obtener el profesional correspondiente al "id" proporcionado
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.obtenerUsuarioPorId(idProfesional);

            // Verificar si se encontró un profesional con el "id" proporcionado
            if (usuario instanceof Profesional) {
                Profesional profesional = (Profesional) usuario;

                // Establecer el profesional como atributo de solicitud
                request.setAttribute("profesional", profesional);

                // Establecer la página específica a incluir en la plantilla
                request.setAttribute("contenido", "editarProfesional.jsp");

                // Redirigir a la vista
                request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
            } else {
                // Si no se encontró un profesional, redirigir a la lista de profesionales
                response.sendRedirect("ListaProfesionales");
            }
        } else {
            // Si el usuario no ha iniciado sesión, redirigir al formulario de inicio de sesión
            response.sendRedirect("Login");
        }
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Obtener los parámetros del formulario
    	int id = Integer.parseInt(request.getParameter("id"));
        String run = request.getParameter("run");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String fechaNacimiento = request.getParameter("nacimiento");
        String titulo = request.getParameter("titulo");
        String fechaIngreso = request.getParameter("fechaIngreso");

        // Crear un objeto Profesional con los datos proporcionados
        Profesional profesional = new Profesional(id, run, nombre, apellido, fechaNacimiento, titulo, fechaIngreso);

        // Actualizar el profesional en la base de datos
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.actualizarProfesional(profesional);

        // Redirigir a la lista de profesionales
        response.sendRedirect("ListaProfesionales");
    }
}
