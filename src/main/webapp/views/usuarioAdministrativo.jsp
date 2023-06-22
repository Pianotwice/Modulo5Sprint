<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container text-center">
	<h1>Crear Administrativo</h1>
    <form class="custom-form" method="post" action="ListaAdministrativos">
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
            <label for="area" class="form-label">Area:</label>
            <input type="text" class="form-control" placeholder="" id="area" name="area">
        </div>
        <div class="mb-3">
            <label for="expPrevia" class="form-label">Experiencia Previa:</label>
            <input type="text" class="form-control" placeholder="" id="expPrevia" name="expPrevia">
        </div>
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
</div>