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

import grupal.conexion.UsuarioDAO;
import grupal.modelo.Profesional;
import grupal.modelo.Usuario;

@WebServlet("/ListaProfesionales")
public class ListaProfesionales extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private UsuarioDAO usuarioDAO;
       
    public ListaProfesionales() {
        super();
        usuarioDAO = new UsuarioDAO();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	// Verificar si el usuario ha iniciado sesión
        HttpSession session = request.getSession();
        if (session.getAttribute("usuario") != null) {
            // Obtener los datos del formulario
            String run = request.getParameter("run");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fechaNacimiento = request.getParameter("nacimiento");
            String titulo = request.getParameter("titulo");
            String fechaIngreso = request.getParameter("fechaIngreso");
            
            // Validar si los datos no son nulos
            if (run != null && !run.isEmpty() && nombre != null && !nombre.isEmpty() && apellido != null && !apellido.isEmpty() &&
                fechaNacimiento != null && !fechaNacimiento.isEmpty() && titulo != null && !titulo.isEmpty() && 
                fechaIngreso != null && !fechaIngreso.isEmpty()) {
                
                // Crear una instancia de Profesional y establecer los datos
                Profesional profesional = new Profesional(run, nombre, apellido, fechaNacimiento, titulo, fechaIngreso);
                
                // Agregar el profesional a la base de datos
                usuarioDAO.agregarProfesional(profesional);
            }
            
            // Obtener la lista de usuarios desde la base de datos
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            List<Profesional> profesionales = obtenerProfesionales(usuarios);
            
            // Establecer la lista de profesionales en la solicitud
            request.setAttribute("profesionales", profesionales);

            // Establecer la página específica a incluir en la plantilla
            request.setAttribute("contenido", "listaProfesionales.jsp");

            // Redirigir a la vista
            request.getRequestDispatcher("views/plantilla.jsp").forward(request, response);
        } else {
        	// Si el usuario no ha iniciado sesión, redirigir al formulario de inicio de sesión
            response.sendRedirect("Login");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doGet(request, response);
    }
    
    private List<Profesional> obtenerProfesionales(List<Usuario> usuarios) {
        List<Profesional> profesionales = new ArrayList<>();
        
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Profesional) {
                Profesional profesional = (Profesional) usuario;
                profesionales.add(profesional);
            }
        }
        return profesionales;
    }
}
