<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pablo Giraldo | administrar</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/x-icon" href="img/favicon.ico?v=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<style>
strong {
	font-size: 17px;
}
</style>
</head>
<body>
	<%
		if (request.getAttribute("isAdmin") == null) {
		// 		response.sendRedirect(request.getContextPath());
		response.sendRedirect("/");
	}
	%>
	<div class="container" style="margin-top: 30px">
		<div class="row justify-content-center">
			<div class="col-sm-6">
				<div class="d-flex justify-content-center">
					<div>
						<h1>Administrar</h1>
					</div>
				</div>
				<br> <br>
				<div class="d-flex justify-content-between">
					<div>
						<a href="/"><strong>Inicio</strong></a>
					</div>
					<div>
						<a href="<%=request.getContextPath()%>/?option=closeSession"><strong>Cerrar
								sesi�n</strong></a>
					</div>
				</div>
				<br> <br>
				<h3>Nuevo art�culo</h3>
				<br>
				<div>
					<form action="admin" method="post">
						<input type="hidden" name="option" value="insert">
						<div class="form-group">
							<label for="title"><strong>T�tulo</strong></label> <input
								type="text" name="title" class="form-control" id="title"
								required>
						</div>
						<div class="form-group">
							<label for="subtitle"><strong>Subt�tulo</strong></label> <input
								type="text" name="subtitle" class="form-control" id="subtitle">
						</div>
						<div class="form-group">
							<label for="image"><strong>Imagen</strong></label> <input
								type="text" name="image" class="form-control" id="image">
						</div>
						<div class="form-group">
							<label for="link"><strong>Enlace</strong></label> <input
								type="text" name="link" class="form-control" id="link">
						</div>
						<div class="form-group">
							<label for="text"><strong>Texto</strong></label> <input
								type="text" name="text" class="form-control" id="text">
						</div>
						<div class="d-flex justify-content-end">
							<div>
								<button type="submit" class="btn btn-primary">Enviar</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>