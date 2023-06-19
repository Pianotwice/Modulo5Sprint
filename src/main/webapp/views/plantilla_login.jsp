<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<header class="text-center">
    	<nav class="d-inline-block">
        	<ul>
            	<li><a href="Index">Inicio</a></li>
        	</ul>
    	</nav>
	</header>

    <main>
    	<jsp:include page="${contenido}"/>
    </main>

    <footer class="fixed-bottom w-100">
        <p>© Copyright Jun 2023 | <a class="text-light custom-link text-decoration-none" href="https://www.facebook.com/iEtzel">Etzel M. Valderrama</a></p>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>