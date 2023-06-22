<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>

<div class="container text-center">
	<h1>Lista de Clientes</h1>
	<table class="table table-dark table-bordered">
		<thead>
			<tr>
				<th>RUN</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Fecha de Nacimiento</th>
				<th>Edad</th>
				<th>AFP</th>
				<th>Dirección</th>
				<th>Comuna</th>
				<th>Teléfono</th>
				<th>Sistema de Salud</th>
			</tr>
		</thead>
		<tbody>
			<% for (grupal.modelo.Cliente cliente : (List<grupal.modelo.Cliente>) request.getAttribute("clientes")) { %>
			<tr>
				<td><%= cliente.getRun() %></td>
				<td><%= cliente.getNombre() %></td>
				<td><%= cliente.getApellido() %></td>
				<td><%= cliente.getFechaNacimiento() %></td>
				<td><%= cliente.getEdad() %></td>
				<td><%= cliente.getAfp() %></td>
				<td><%= cliente.getDireccion() %></td>
				<td><%= cliente.getComuna() %></td>
				<td><%= cliente.getTelefono() %></td>
				<td><%= cliente.getSistemaSalud() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
</div>