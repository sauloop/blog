<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pablo Giraldo | iniciar sesi�n</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container" style="margin-top: 30px">
		<div class="row justify-content-center">
			<div class="col-sm-4">
				<div class="d-flex justify-content-center">
					<div>
						<h1>Iniciar sesi�n</h1>
					</div>
				</div>
				<br> <br>
				<div>
					<form action="login" method="post">
						<div class="form-group">
							<label for="email"><strong>Direcci�n de correo</strong></label> <input
								type="email" name="email" class="form-control" id="email">
						</div>
						<div class="form-group">
							<label for="pass"><strong>Contrase�a</strong></label> <input
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