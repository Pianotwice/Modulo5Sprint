package com.modulo5.grupal01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        
        // Escribir el contenido HTML de la página de inicio
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Grupal 01</title>");
        out.println("</head>");
        out.println("<body style=\"background-color:SlateBlue; color:White;\">");
        out.println("<h1>Desarrollo de aplicaciones web dinámicas con Java</h1>");
        out.println("<p>\tProyecto web dinámico utilizando la herramienta Eclipse en su distribución Eclipse IDE For Enterprise Java Developer.</p>");
        out.println("<h3>Menú:</h3>");
        out.println("<ul>");
        out.println("<li><a href=\"Login\" style=\"color:White;\">Iniciar sesión</a></li>");
        out.println("<li><a href=\"Contacto\" style=\"color:White;\">Contacto</a></li>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
