<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container">
	<h1 class="text-center">Crear Administrativo</h1>
    <form class="custom-form" method="post" action="ListaAdministrativos">
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
            <label for="area" class="form-label"><span class="text-danger">*</span>Area:</label>
            <input type="text" class="form-control" placeholder="" id="area" name="area" required>
        </div>
        <div class="mb-3">
            <label for="expPrevia" class="form-label"><span class="text-danger">*</span>Experiencia Previa:</label>
            <input type="text" class="form-control" placeholder="" id="expPrevia" name="expPrevia" required>
        </div>
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
</div>