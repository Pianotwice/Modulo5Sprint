<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>

<div class="container text-center">
	<h1>Lista de Profesionales</h1>
	<table class="table table-dark table-bordered">
		<thead>
			<tr>
				<th>RUN</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Fecha de Nacimiento</th>
				<th>Titulo</th>
				<th>Fecha de Ingreso</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (grupal.modelo.Profesional profesional : (List<grupal.modelo.Profesional>) request.getAttribute("profesionales")) {
			%>
			<tr>
				<td><%= profesional.getRun() %></td>
				<td><%= profesional.getNombre() %></td>
				<td><%= profesional.getApellido() %></td>
				<td><%= profesional.getFechaNacimiento() %></td>
				<td><%= profesional.getTitulo() %></td>
				<td><%= profesional.getFechaIngreso() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</div>