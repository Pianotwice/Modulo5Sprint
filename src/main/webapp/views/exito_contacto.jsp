<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    	<div class="container text-center">
			<h1>Tu consulta ha sido enviada exitosamente</h1>
    		<p>Estimado <%= request.getAttribute("nombre") %></p>
    		<p>En la brevedad de lo posible le estaremos dando respuesta a su correo electrónico <%= request.getAttribute("email") %> respecto a su consulta:</p>
    		<p><%= request.getAttribute("mensaje") %></p>
		</div>
