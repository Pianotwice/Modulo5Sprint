<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <h2 class="text-center">Editar Cliente</h2>
    <form class="custom-form" action="EditarCliente" method="post">
    	<div class="form-group mb-3">
            <label for="id">Identificador:</label>
            <input type="text" class="form-control" id="id" name="id" value="${cliente.id}" readonly>
        </div>
        <div class="form-group mb-3">
            <label for="run">RUN:</label>
            <input type="text" class="form-control" id="run" name="run" value="${cliente.run}" readonly>
        </div>
        <div class="form-group mb-3">
            <label for="nombre">Nombre:</label>
            <input type="text" class="form-control" id="nombre" name="nombre" value="${cliente.nombre}" required>
        </div>
        <div class="form-group mb-3">
            <label for="apellido">Apellido:</label>
            <input type="text" class="form-control" id="apellido" name="apellido" value="${cliente.apellido}" required>
        </div>
        <div class="form-group mb-3">
            <label for="nacimiento">Fecha de Nacimiento:</label>
            <input type="text" class="form-control" id="nacimiento" name="nacimiento" value="${cliente.fechaNacimiento}" required>
        </div>
        <div class="form-group mb-3">
            <label for="edad">Edad:</label>
            <input type="number" class="form-control" id="edad" name="edad" value="${cliente.edad}" required>
        </div>
        <div class="form-group mb-3">
            <label for="afp">AFP:</label>
            <input type="text" class="form-control" id="afp" name="afp" value="${cliente.afp}" required>
        </div>
        <div class="form-group mb-3">
            <label for="direccion">Dirección:</label>
            <input type="text" class="form-control" id="direccion" name="direccion" value="${cliente.direccion}" required>
        </div>
        <div class="form-group mb-3">
            <label for="comuna">Comuna:</label>
            <input type="text" class="form-control" id="comuna" name="comuna" value="${cliente.comuna}" required>
        </div>
        <div class="form-group mb-3">
            <label for="telefono">Teléfono:</label>
            <input type="text" class="form-control" id="telefono" name="telefono" value="${cliente.telefono}" required>
        </div>
        <div class="form-group mb-3">
            <label for="sistemaSalud">Sistema de Salud:</label>
            <select class="form-control" id="sistemaSalud" name="sistemaSalud" required>
                <option value="1" ${cliente.sistemaSalud == 1 ? 'selected' : ''}>Fonasa</option>
                <option value="2" ${cliente.sistemaSalud == 2 ? 'selected' : ''}>Isapre</option>
            </select>
        </div>
        <button type="submit" class="btn btn-primary">Guardar Cambios</button>
    </form>
</div>