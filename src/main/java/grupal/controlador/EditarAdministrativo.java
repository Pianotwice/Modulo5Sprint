package grupal.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupal.conexion.UsuarioDAO;
import grupal.modelo.Administrativo;
import grupal.modelo.Usuario;

/**
 * Servlet implementation class EditarAdministrativo
 */
@WebServlet("/EditarAdministrativo")
public class EditarAdministrativo extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarAdministrativo() {
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
        	int idAdministrativo = Integer.parseInt(request.getParameter("id"));

            // Obtener el administrativo correspondiente al "id" proporcionado
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.obtenerUsuarioPorId(idAdministrativo);

            // Verificar si se encontró un administrativo con el "id" proporcionado
            if (usuario instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) usuario;

                // Establecer el administrativo como atributo de solicitud
                request.setAttribute("administrativo", administrativo);

                // Establecer la página específica a incluir en la plantilla
                request.setAttribute("contenido", "editarAdministrativo.jsp");

                // Redirigir a la vista
                request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
            } else {
                // Si no se encontró un administrativo, redirigir a la lista de administrativos
                response.sendRedirect("ListaAdministrativos");
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
        String area = request.getParameter("area");
        String expPrevia = request.getParameter("expPrevia");

        // Crear un objeto Administrativo con los datos proporcionados
        Administrativo administrativo = new Administrativo(id, run, nombre, apellido, fechaNacimiento, area, expPrevia);

        // Actualizar el administrativo en la base de datos
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.actualizarAdministrativo(administrativo);

        // Redirigir a la lista de administrativos
        response.sendRedirect("ListaAdministrativos");
    }
}
