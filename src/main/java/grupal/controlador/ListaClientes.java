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
import grupal.modelo.Cliente;
import grupal.modelo.Usuario;

@WebServlet("/ListaClientes")
public class ListaClientes extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private UsuarioDAO usuarioDAO;
       
    public ListaClientes() {
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
            String edadStr = request.getParameter("edad");
            Integer edad = null;
            String afp = request.getParameter("afp");
            String direccion = request.getParameter("direccion");
            String comuna = request.getParameter("comuna");
            String telefono = request.getParameter("telefono");
            String sistemaSaludStr = request.getParameter("sistemaSalud");
            Integer sistemaSalud = null;
            
            if (edadStr != null && !edadStr.isEmpty()) {
                edad = Integer.parseInt(edadStr);
            }
            if (sistemaSaludStr != null && !sistemaSaludStr.isEmpty()) {
            	sistemaSalud = Integer.parseInt(sistemaSaludStr);
            }
            
            // Validar si los datos no son nulos
            if (run != null && !run.isEmpty() && nombre != null && !nombre.isEmpty() && apellido != null && !apellido.isEmpty() && fechaNacimiento != null && 
            	!fechaNacimiento.isEmpty() && edad != null && !String.valueOf(edad).isEmpty() && afp != null && !afp.isEmpty() && direccion != null && 
            	!direccion.isEmpty() && comuna != null && !comuna.isEmpty() && telefono != null && !telefono.isEmpty() && sistemaSalud != null && 
            	!String.valueOf(sistemaSalud).isEmpty()) {
            	
                // Crear una instancia de Cliente y establecer los datos
            	Cliente cliente = new Cliente(run, nombre, apellido, fechaNacimiento, edad, afp, direccion, comuna, telefono, sistemaSalud);
            	
            	// Agregar el cliente a la base de datos
            	usuarioDAO.agregarCliente(cliente);
            }
            
            // Obtener la lista de clientes desde la base de datos
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            List<Cliente> clientes = obtenerClientes(usuarios);
            
            // Establecer la lista de clientes en la solicitud
            request.setAttribute("clientes", clientes);

            // Establecer la página específica a incluir en la plantilla
            request.setAttribute("contenido", "listaClientes.jsp");

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
    
    private List<Cliente> obtenerClientes(List<Usuario> usuarios) {
        List<Cliente> clientes = new ArrayList<>();
        
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Cliente) {
                Cliente cliente = (Cliente) usuario;
                clientes.add(cliente);
            }
        }
        return clientes;
    }
}