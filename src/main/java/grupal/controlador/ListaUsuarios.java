package grupal.controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupal.modelo.Usuario;
import grupal.conexion.UsuarioDAO;
import grupal.conexion.ConexionBD;

@WebServlet("/ListaUsuarios")
public class ListaUsuarios extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Objeto DAO para acceder a las operaciones de la base de datos
    private UsuarioDAO usuarioDAO;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaUsuarios() {
        super();
        // Inicializar el objeto DAO
        usuarioDAO = new UsuarioDAO();
    }

    @Override
    public void init() throws ServletException {
        super.init();
        ConexionBD.getInstancia();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Verificar si el usuario ha iniciado sesión
        HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            // Obtener la lista de usuarios desde la base de datos
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();

            // Establecer la lista de usuarios en la solicitud
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
        doGet(request, response);
    }
}