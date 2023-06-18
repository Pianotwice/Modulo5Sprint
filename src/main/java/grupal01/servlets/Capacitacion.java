package grupal01.servlets;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Capacitacion
 */
@WebServlet("/Capacitacion")
public class Capacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Capacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Obtener el contenido de la plantilla HTML desde un archivo externo
        InputStream templateStream = getServletContext().getResourceAsStream("templates/plantilla01.html");
        InputStreamReader templateReader = new InputStreamReader(templateStream, StandardCharsets.UTF_8);
        
        // Leer el contenido de la plantilla y guardar en una cadena
        StringBuilder templateContentBuilder = new StringBuilder();
        char[] buffer = new char[4096];
        int charsRead;
        while ((charsRead = templateReader.read(buffer)) != -1) {
            templateContentBuilder.append(buffer, 0, charsRead);
        }
        String templateContent = templateContentBuilder.toString();
        
        // Generar el contenido específico de la página
        String pageContent = "<h1 class=\"text-center\">Crear capacitación</h1>"
        					+ "<div class=\"container\">"
        						+ "<form class=\"custom-form\" method=\"post\">"
        							+ "<div class=\"mb-3\">"
        								+ "<label for=\"name\" class=\"form-label\">Nombre:</label>"
        								+ "<input type=\"text\" class=\"form-control\" id=\"name\">"
        							+ "</div>"
        							+ "<div class=\"mb-3\">"
    									+ "<label for=\"time\" class=\"form-label\">Horario:</label>"
    									+ "<input type=\"text\" class=\"form-control\" placeholder=\"(HH:mm - HH:mm)\" id=\"time\">"
    								+ "</div>"
        							+ "<div class=\"mb-3\">"
    									+ "<label for=\"date\" class=\"form-label\">Fecha:</label>"
    									+ "<input type=\"text\" class=\"form-control\" id=\"date\">"
    								+ "</div>"
    								+ "<button type=\"submit\" class=\"btn btn-primary\">Enviar</button>"
    							+ "</form>"
    						+ "</div>";
        
        // Reemplazar la etiqueta <main> en la plantilla con el contenido específico de la página
        String finalContent = templateContent.replace("<main></main>", "<main>" + pageContent + "</main>");
        
        // Establecer el tipo de contenido de la respuesta
        response.setContentType("text/html");
        
        // Escribir el contenido en la respuesta del servlet
        response.getWriter().write(finalContent);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // Obtener los parámetros del formulario
	    String nombre = request.getParameter("nombre");
	    String horario = request.getParameter("horario");
	    String fecha = request.getParameter("fecha");

	    // Realizar la lógica para crear la capacitación (guardar en la base de datos, etc.)

	    // Redirigir a una página de éxito o mostrar un mensaje de éxito
	    response.sendRedirect("templates/capacitacion.html");
	}

}
