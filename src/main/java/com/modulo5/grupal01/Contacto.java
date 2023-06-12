package com.modulo5.grupal01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        // Escribir el contenido HTML del formulario de contacto
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Grupal 01</title>");
        out.println("</head>");
        out.println("<body style=\"background-color:SlateBlue; color:White;\">");
        out.println("<h1>Contacto</h1>");
        out.println("<form method=\"post\" action=\"Enviado\">");
        out.println("<label for=\"name\">Nombre:</label>");
        out.println("<input type=\"text\" name=\"name\" id=\"name\"><br><br>");
        out.println("<label for=\"email\">Email:</label>");
        out.println("<input type=\"email\" name=\"email\" id=\"email\"><br><br>");
        out.println("<input type=\"submit\" value=\"Enviar\">");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}