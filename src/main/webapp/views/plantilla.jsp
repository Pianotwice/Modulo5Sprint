<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Grupal 01</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<link rel="stylesheet" href="css/estilos.css">
</head>
<body>
	<header class="text-center p-2">
		<nav class="d-inline-block">
			<ul>
				<li><a href="Index">Inicio</a></li>
				<li class="dropdown"><a class="dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" 
				aria-expanded="false">Crear Usuario</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="CrearCliente">Cliente</a></li>
						<li><a class="dropdown-item" href="CrearProfesional">Profesional</a></li>
						<li><a class="dropdown-item" href="CrearAdministrativo">Administrativo</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" 
				aria-expanded="false">Listar Usuarios</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="ListaClientes">Cliente</a></li>
						<li><a class="dropdown-item" href="ListaProfesionales">Profesional</a></li>
						<li><a class="dropdown-item" href="ListaAdministrativos">Administrativo</a></li>
					</ul></li>
				<li class="dropdown"><a class="dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" 
				aria-expanded="false">Capacitaciones</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="CrearCapacitacion">Crear Capacitacion</a></li>
						<li><a class="dropdown-item" href="ListaCapacitaciones">Listar Capacitaciones</a></li>
					</ul></li>
				<li><a href="Contacto">Contacto</a></li>
				<% // Verificar si el usuario ha iniciado sesión
            	String usuario = (String) session.getAttribute("usuario");
            	if (usuario != null) { %>
				<li><a href="Logout">Cerrar sesion</a></li>
				<% } else { %>
				<li><a href="Login">Iniciar sesion</a></li>
				<% } %>
			</ul>
		</nav>
	</header>

	<main class="mb-3" style="min-height: 550px;">
		<jsp:include page="${contenido}" />
	</main>

	<footer class="h6 p-2">
		<p>
			© Copyright Jun 2023 | <a class="text-light custom-link text-decoration-none" 
			href="https://www.facebook.com/iEtzel">Etzel M. Valderrama</a> | <a>Ricardo Silva</a> | <a>Matias Muñoz</a> | <a>Fernando Bermudez</a>
		</p>
		<p>
			<a class="text-light custom-link " href="DescripcionActividad"
			target="_blank">Criterio de evaluacion para esta actividad</a>
		</p>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>