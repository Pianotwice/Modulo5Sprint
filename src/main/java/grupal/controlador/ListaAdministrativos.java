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

import grupal.conexion.UsuarioDAO;
import grupal.modelo.Administrativo;
import grupal.modelo.Usuario;

@WebServlet("/ListaAdministrativos")
public class ListaAdministrativos extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private UsuarioDAO usuarioDAO;

    public ListaAdministrativos() {
        super();
        usuarioDAO = new UsuarioDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Verificar si el usuario ha iniciado sesión
        HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            // Obtener los datos del formulario
            String run = request.getParameter("run");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fechaNacimiento = request.getParameter("nacimiento");
            String area = request.getParameter("area");
            String expPrevia = request.getParameter("expPrevia");

            // Validar si los datos no son nulos
            if (run != null && !run.isEmpty() && nombre != null && !nombre.isEmpty() && apellido != null
                    && !apellido.isEmpty() && fechaNacimiento != null && !fechaNacimiento.isEmpty() && area != null
                    && !area.isEmpty() && expPrevia != null && !expPrevia.isEmpty()) {

                // Crear una instancia de Administrativo y establecer los datos
                Administrativo administrativo = new Administrativo(run, nombre, apellido, fechaNacimiento, area, expPrevia);

                // Agregar el administrativo a la base de datos
                usuarioDAO.agregarAdministrativo(administrativo);
            }

            // Obtener la lista de usuarios desde la base de datos
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            List<Administrativo> administrativos = obtenerAdministrativos(usuarios);

            // Establecer la lista de administrativos en la solicitud
            request.setAttribute("administrativos", administrativos);

            // Establecer la página específica a incluir en la plantilla
            request.setAttribute("contenido", "listaAdministrativos.jsp");

            // Redirigir a la vista
            request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
        } else {
            // Si el usuario no ha iniciado sesión, redirigir al formulario de inicio de sesión
            response.sendRedirect("Login");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private List<Administrativo> obtenerAdministrativos(List<Usuario> usuarios) {
        List<Administrativo> administrativos = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            if (usuario instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) usuario;
                administrativos.add(administrativo);
            }
        }
        return administrativos;
    }
}
