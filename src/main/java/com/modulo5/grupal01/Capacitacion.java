package com.modulo5.grupal01;

import java.io.IOException;
import java.io.PrintWriter;

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
		// Mostrar el formulario para crear una nueva capacitación
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>Grupal 01</title>");
	    out.println("</head>");
	    out.println("<body style=\"background-color:DarkBlue; color:White; text-align:center;\">");
	    out.println("<h1>Crear capacitación</h1>");
	    out.println("<form method=\"post\">");
	    out.println("Nombre: <input type=\"text\" name=\"nombre\"><br><br>");
	    out.println("Horario: <input type=\"text\" name=\"horario\"> (HH:mm - HH:mm)<br><br>");
	    out.println("Fecha: <input type=\"text\" name=\"fecha\"><br><br>");
	    out.println("<input type=\"submit\" value=\"Crear\">");
	    out.println("</form>");
	    out.println("</body>");
	    out.println("</html>");
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
