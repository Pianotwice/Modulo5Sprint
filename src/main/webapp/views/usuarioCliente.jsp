<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container">
	<h1 class="text-center">Crear Cliente</h1>
    <form class="custom-form" method="post" action="ListaClientes">
        <div class="mb-3">
            <label for="run" class="form-label"><span class="text-danger">*</span>RUN:</label>
            <input type="text" class="form-control" placeholder="12345678-9" id="run" name="run" required>
        </div>
        <div class="mb-3">
            <label for="nombre" class="form-label"><span class="text-danger">*</span>Nombre:</label>
            <input type="text" class="form-control" placeholder="" id="nombre" name="nombre" required>
        </div>
        <div class="mb-3">
            <label for="apellido" class="form-label"><span class="text-danger">*</span>Apellido:</label>
            <input type="text" class="form-control" placeholder="" id="apellido" name="apellido" required>
        </div>
        <div class="mb-3">
            <label for="nacimiento" class="form-label"><span class="text-danger">*</span>Fecha de Nacimiento:</label>
            <input type="text" class="form-control" placeholder="30/03/1999" id="nacimiento" name="nacimiento" required>
        </div>
        <div class="mb-3">
            <label for="edad" class="form-label"><span class="text-danger">*</span>Edad:</label>
            <input type="text" class="form-control" placeholder="" id="edad" name="edad" required>
        </div>
        <div class="mb-3">
            <label for="afp" class="form-label"><span class="text-danger">*</span>AFP:</label>
            <input type="text" class="form-control" placeholder="" id="afp" name="afp" required>
        </div>
        <div class="mb-3">
            <label for="direccion" class="form-label"><span class="text-danger">*</span>Direccion:</label>
            <input type="text" class="form-control" placeholder="" id="direccion" name="direccion" required>
        </div>
        <div class="mb-3">
            <label for="comuna" class="form-label"><span class="text-danger">*</span>Comuna:</label>
            <input type="text" class="form-control" placeholder="" id="comuna" name="comuna" required>
        </div>
        <div class="mb-3">
            <label for="telefono" class="form-label"><span class="text-danger">*</span>Telefono:</label>
            <input type="text" class="form-control" placeholder="+56 9 1234 5678" id="telefono" name="telefono" required>
        </div>
        <div class="mb-3">
            <label for="sistemaSalud" class="form-label"><span class="text-danger">*</span>Sistema de Salud:</label>
            <input type="number" class="form-control" placeholder="1 para Fonasa, 2 para Isapre" id="sistemaSalud" 
            name="sistemaSalud" required pattern="[1-2]">
        </div>
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
</div>