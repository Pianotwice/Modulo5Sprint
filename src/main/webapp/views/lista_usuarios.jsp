<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>

<div class="container text-center">
    <h1>Lista de Usuarios</h1>
    <table class="table table-dark table-bordered">
        <thead>
            <tr>
                <th>RUN</th>
                <th>Nombre</th>
                <th>Fecha de Nacimiento</th>
            </tr>
        </thead>
        <tbody>
            <% for (grupal.modelo.Usuario user : (List<grupal.modelo.Usuario>) request.getAttribute("usuarios")) { %>
            <tr>
                <td><%= user.getRun() %></td>
                <td><%= user.getNombre() %></td>
                <td><%= user.getFechaNacimiento() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</div>