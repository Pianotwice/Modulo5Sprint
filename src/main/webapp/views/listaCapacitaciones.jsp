<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>

<div class="container text-center">
	<h1>Lista de Capacitaciones</h1>
	<table class="table table-dark table-bordered">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Horario</th>
				<th>Fecha</th>
			</tr>
		</thead>
		<tbody>
			<% for (grupal.modelo.Capacitacion capacitacion : (List<grupal.modelo.Capacitacion>) request.getAttribute("capacitaciones")) { %>
			<tr>
				<td><%= capacitacion.getNombre() %></td>
				<td><%= capacitacion.getHorario() %></td>
				<td><%= capacitacion.getFecha() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</div>