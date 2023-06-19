<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<div class="container text-center">
	<h1>Contactanos</h1>
    <form class="custom-form" method="post" action="ExitoContacto">
        <div class="mb-3">
            <label for="name" class="form-label">Nombre:</label>
            <input type="text" class="form-control" id="name" name="name">
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email:</label>
            <input type="email" class="form-control" id="email" name="email">
        </div>
        <div class="mb-3">
            <textarea class="form-control" id="message" rows="5" placeholder="Ingrese el motivo de su consulta aquí..." name="message"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</div>
