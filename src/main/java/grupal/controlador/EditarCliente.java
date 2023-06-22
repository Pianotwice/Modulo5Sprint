package grupal.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import grupal.conexion.UsuarioDAO;
import grupal.modelo.Cliente;
import grupal.modelo.Usuario;

/**
 * Servlet implementation class EditarCliente
 */
@WebServlet("/EditarCliente")
public class EditarCliente extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCliente() {
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
        	int idCliente = Integer.parseInt(request.getParameter("id"));

            // Obtener el cliente correspondiente al "id" proporcionado
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.obtenerUsuarioPorId(idCliente);

            // Verificar si se encontró un cliente con el "id" proporcionado
            if (usuario instanceof Cliente) {
                Cliente cliente = (Cliente) usuario;

                // Establecer el cliente como atributo de solicitud
                request.setAttribute("cliente", cliente);

                // Establecer la página específica a incluir en la plantilla
                request.setAttribute("contenido", "editarCliente.jsp");

                // Redirigir a la vista
                request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
            } else {
                // Si no se encontró un cliente, redirigir a la lista de clientes
                response.sendRedirect("ListaClientes");
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
        int edad = Integer.parseInt(request.getParameter("edad"));
        String afp = request.getParameter("afp");
        String direccion = request.getParameter("direccion");
        String comuna = request.getParameter("comuna");
        String telefono = request.getParameter("telefono");
        int sistemaSalud = Integer.parseInt(request.getParameter("sistemaSalud"));

        // Crear un objeto Cliente con los datos proporcionados
        Cliente cliente = new Cliente(id, run, nombre, apellido, fechaNacimiento, edad, afp, direccion, comuna, telefono,
                sistemaSalud);

        // Actualizar el cliente en la base de datos
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.actualizarCliente(cliente);

        // Redirigir a la lista de clientes
        response.sendRedirect("ListaClientes");
    }
}
