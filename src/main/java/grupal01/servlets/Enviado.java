package grupal01.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Enviado
 */
@WebServlet("/Enviado")
public class Enviado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Enviado() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        // Obtener los valores del formulario de contacto
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        
        // Escribir la respuesta HTML con los datos del formulario de contacto
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Grupal 01</title>");
        out.println("</head>");
        out.println("<body style=\"background-color:DarkBlue; color:White; text-align:center;\">");
        out.println("<h1>Los datos de contacto han sido enviados exitosamente.</h1>");
        out.println("<p>Nombre: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}