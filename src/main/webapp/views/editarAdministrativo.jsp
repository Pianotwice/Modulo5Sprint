<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div class="container">
    <h2 class="text-center">Editar Administrativo</h2>
    <form class="custom-form" action="EditarAdministrativo" method="post">
    	<div class="form-group mb-3">
            <label for="id">Identificador:</label>
            <input type="text" class="form-control" id="id" name="id" value="${administrativo.id}" readonly>
        </div>
        <div class="form-group mb-3">
            <label for="run">RUN:</label>
            <input type="text" class="form-control" id="run" name="run" value="${administrativo.run}" readonly>
        </div>
        <div class="form-group mb-3">
            <label for="nombre"><span class="text-danger">*</span>Nombre:</label>
            <input type="text" class="form-control" id="nombre" name="nombre" value="${administrativo.nombre}" required>
        </div>
        <div class="form-group mb-3">
            <label for="apellido"><span class="text-danger">*</span>Apellido:</label>
            <input type="text" class="form-control" id="apellido" name="apellido" value="${administrativo.apellido}" required>
        </div>
        <div class="form-group mb-3">
            <label for="nacimiento"><span class="text-danger">*</span>Fecha de Nacimiento:</label>
            <input type="text" class="form-control" id="nacimiento" name="nacimiento" value="${administrativo.fechaNacimiento}" required>
        </div>
        <div class="form-group mb-3">
            <label for="area"><span class="text-danger">*</span>Area:</label>
            <input type="text" class="form-control" id="area" name="area" value="${administrativo.area}" required>
        </div>
        <div class="form-group mb-3">
            <label for="expPrevia"><span class="text-danger">*</span>Experiencia Previa:</label>
            <input type="text" class="form-control" id="expPrevia" name="expPrevia" value="${administrativo.expPrevia}" required>
        </div>
        <button type="submit" class="btn btn-primary">Guardar Cambios</button>
    </form>
</div>