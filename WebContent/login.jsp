<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
<title>Pablo Giraldo | iniciar sesión</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" type="image/x-icon" href="favicon.ico?v=1">
<link rel="stylesheet" href="css/style.css?v=16">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<div class="container" style="margin-top: 30px">
		<div class="row justify-content-center">
			<div class="col-sm-4">
				<div class="d-flex justify-content-center">
					<div>
						<h1>Iniciar sesión</h1>
					</div>
				</div>
				<br> <br>
				<div>
					<form action="login" method="post">
						<div class="form-group">
							<label for="email"><strong>Dirección de correo</strong></label> <input
								type="email" name="email" class="form-control" id="email">
						</div>
						<div class="form-group">
							<label for="pass"><strong>Contraseña</strong></label> <input
								type="password" name="pass" class="form-control" id="pass">
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