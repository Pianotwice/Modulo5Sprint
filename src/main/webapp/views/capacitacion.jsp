<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="container text-center">
	<h1>Crear capacitación</h1>
    <form class="custom-form" method="post" action="ListaCapacitaciones">
        <div class="mb-3">
            <label for="name" class="form-label">Nombre:</label>
            <input type="text" class="form-control" id="name" name="name">
        </div>
        <div class="mb-3">
            <label for="time" class="form-label">Horario:</label>
            <input type="text" class="form-control" placeholder="Ej: 10:00-13:00" id="time" name="time">
        </div>
        <div class="mb-3">
            <label for="date" class="form-label">Fecha:</label>
            <input type="text" class="form-control" placeholder="Ej: 30/03/1999" id="date" name="date">
        </div>
        <button type="submit" class="btn btn-primary">Guardar</button>
    </form>
</div>
