<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>

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
            <% for (grupal.modelo.Usuario user : (List<grupal.modelo.Usuario>) request.getAttribute("clientes")) { %>
            <tr>
                <td><%= user.getRun() %></td>
                <td><%= user.getNombre() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getApellido() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getFechaNacimiento() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getEdad() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getAfp() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getDireccion() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getComuna() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getTelefono() %></td>
                <td><%= ((grupal.modelo.Cliente) user).getSistemaSalud() %></td>
            </tr>
            <% } %>
        </tbody>
    </table>
</div>