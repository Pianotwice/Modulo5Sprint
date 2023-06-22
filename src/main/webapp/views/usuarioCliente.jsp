<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container text-center">
	<h1>Crear Cliente</h1>
    <form class="custom-form" method="post" action="ListaClientes">
        <div class="mb-3">
            <label for="run" class="form-label">RUN:</label>
            <input type="text" class="form-control" placeholder="12345678-9" id="run" name="run">
        </div>
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre:</label>
            <input type="text" class="form-control" placeholder="" id="nombre" name="nombre">
        </div>
        <div class="mb-3">
            <label for="apellido" class="form-label">Apellido:</label>
            <input type="text" class="form-control" placeholder="" id="apellido" name="apellido">
        </div>
        <div class="mb-3">
            <label for="nacimiento" class="form-label">Fecha de Nacimiento:</label>
            <input type="text" class="form-control" placeholder="30/03/1999" id="nacimiento" name="nacimiento">
        </div>
        <div class="mb-3">
            <label for="edad" class="form-label">Edad:</label>
            <input type="text" class="form-control" placeholder="" id="edad" name="edad">
        </div>
        <div class="mb-3">
            <label for="afp" class="form-label">AFP:</label>
            <input type="text" class="form-control" placeholder="" id="afp" name="afp">
        </div>
        <div class="mb-3">
            <label for="direccion" class="form-label">Direccion:</label>
            <input type="text" class="form-control" placeholder="" id="direccion" name="direccion">
        </div>
        <div class="mb-3">
            <label for="comuna" class="form-label">Comuna:</label>
            <input type="text" class="form-control" placeholder="" id="comuna" name="comuna">
        </div>
        <div class="mb-3">
            <label for="telefono" class="form-label">Telefono:</label>
            <input type="text" class="form-control" placeholder="+56 9 1234 5678" id="telefono" name="telefono">
        </div>
        <div class="mb-3">
            <label for="sistemaSalud" class="form-label">Sistema de Salud:</label>
            <input type="text" class="form-control" placeholder="1 para Fonasa, 2 para Isapre" id="sistemaSalud" name="sistemaSalud">
        </div>
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
</div>