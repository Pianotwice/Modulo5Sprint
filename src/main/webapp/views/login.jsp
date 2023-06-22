<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<div class="container text-center">
	<h1>Iniciar sesión</h1>
	<form class="custom-form" method="post" action="Login">
		<div class="mb-3">
			<label for="usuario" class="form-label">Usuario:</label>
			<input type="text" class="form-control" id="usuario" name="usuario">
		</div>
		<div class="mb-3">
			<label for="contrasena" class="form-label">Contraseña:</label>
			<input type="password" class="form-control" id="contrasena" name="contrasena">
		</div>
		<button type="submit" class="btn btn-primary">Ingresar</button>
	</form>
</div>