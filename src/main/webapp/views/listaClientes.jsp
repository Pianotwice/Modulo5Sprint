<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>

<div class="container text-center">
    <h1>Lista de Clientes</h1>
    <table class="table table-dark table-bordered">
        <tbody>
            <% int count = 0; %>
            <% for (grupal.modelo.Cliente cliente : (List<grupal.modelo.Cliente>) request.getAttribute("clientes")) { %>
            <% if (count % 10 == 0) { %>
            <% if (count != 0) { %>
            <% } %>
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
                    <th></th>
                </tr>
            </thead>
        </tbody>
        <tbody>
        <% } %>
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
            <td>
                <a href="EditarCliente?run=<%= cliente.getRun() %>" class="btn btn-success">Editar</a>
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
