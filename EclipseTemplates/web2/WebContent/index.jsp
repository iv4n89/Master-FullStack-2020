<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Configuracion para que todo funcione</h5>
	<ul>
		<li>Servidor Apache Tomee 8, puerto 8084</li>
		<li>JavaEE 8</li>
	</ul>
	<p>
		Invocación del servlet "com.cloudftic.web2.test.ServletTest": <a
			href="stest">/stest</a>
	</p>
	<p>
		Invocación del servicio REST
		"com.cloudftic.web2.rest.RestServiceTest": <a href="resources/ping">/resources/ping</a>
	</p>
	<p>
		Invocación de páginas JSF: <a href="faces/default.xhtml">default.xhtml</a>
	</p>
	<p>
		Probar web socket eco: <a href="cliente_socket_eco.html">cliente_socket_eco.html</a>
	</p>
</body>
</html>