<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container text-center">
	<h1>Crear Profesional</h1>
    <form class="custom-form" method="post" action="ListaProfesionales">
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
            <label for="titulo" class="form-label">Titulo:</label>
            <input type="text" class="form-control" placeholder="" id="titulo" name="titulo">
        </div>
        <div class="mb-3">
            <label for="fechaIngreso" class="form-label">Fecha de Ingreso:</label>
            <input type="text" class="form-control" placeholder="30/03/1999" id="fechaIngreso" name="fechaIngreso">
        </div>
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
</div>