<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <h2 class="text-center">Editar Profesional</h2>
    <form class="custom-form" action="EditarProfesional" method="post">
    	<div class="form-group mb-3">
            <label for="id">Identificador:</label>
            <input type="text" class="form-control" id="id" name="id" value="${profesional.id}" readonly>
        </div>
        <div class="form-group mb-3">
            <label for="run">RUN:</label>
            <input type="text" class="form-control" id="run" name="run" value="${profesional.run}" readonly>
        </div>
        <div class="form-group mb-3">
            <label for="nombre"><span class="text-danger">*</span>Nombre:</label>
            <input type="text" class="form-control" id="nombre" name="nombre" value="${profesional.nombre}" required>
        </div>
        <div class="form-group mb-3">
            <label for="apellido"><span class="text-danger">*</span>Apellido:</label>
            <input type="text" class="form-control" id="apellido" name="apellido" value="${profesional.apellido}" required>
        </div>
        <div class="form-group mb-3">
            <label for="nacimiento"><span class="text-danger">*</span>Fecha de Nacimiento:</label>
            <input type="text" class="form-control" id="nacimiento" name="nacimiento" value="${profesional.fechaNacimiento}" required>
        </div>
        <div class="form-group mb-3">
            <label for="titulo"><span class="text-danger">*</span>Titulo:</label>
            <input type="text" class="form-control" id="titulo" name="titulo" value="${profesional.titulo}" required>
        </div>
        <div class="form-group mb-3">
            <label for="fechaIngreso"><span class="text-danger">*</span>Fecha de Ingreso:</label>
            <input type="text" class="form-control" id="fechaIngreso" name="fechaIngreso" value="${profesional.fechaIngreso}" required>
        </div>
        <button type="submit" class="btn btn-primary">Guardar Cambios</button>
    </form>
</div>