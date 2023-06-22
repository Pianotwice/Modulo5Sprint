<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>

<div class="container text-center">
    <h1>Lista de Profesionales</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (grupal.modelo.Profesional profesional : (List<grupal.modelo.Profesional>) request.getAttribute("profesionales")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
            <thead>
                <tr>
                    <th>RUN</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Fecha de Nacimiento</th>
					<th>Titulo</th>
					<th>Fecha de Ingreso</th>
                    <th></th>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
        <tr>
            <td><%= profesional.getRun() %></td>
			<td><%= profesional.getNombre() %></td>
			<td><%= profesional.getApellido() %></td>
			<td><%= profesional.getFechaNacimiento() %></td>
			<td><%= profesional.getTitulo() %></td>
			<td><%= profesional.getFechaIngreso() %></td>
            <td>
                <a href="EditarProfesional?run=<%= profesional.getRun() %>" class="btn btn-success">Editar</a>
            </td>
        </tr>
        <% count++; %>
        <% } %>
        </tbody>
    </table>
    <ul class="pagination">
        <% int pages = count / 10 + 1; %>
        <li class="page-item"><a class="page-link" href="?pages=<%= pages %>"><%= pages %></a></li>
    </ul>
</div>