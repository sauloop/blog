<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="headerTemplate.jsp"%>

<div class="container" style="margin-top: 30px">
	<div class="row">
		<div class="col-sm-4">
			<h2>Sobre mí</h2>
			<div class="aboutimg">
				<a href="files/cvPabloGiraldo.pdf"><img src="img/avatar.png"
					alt="Avatar" title="Ver currículum" style="height: 200px;"></a>
			</div>
			<br>

			<h3>Enlaces</h3>
			<ul class="nav nav-pills flex-column">
				<!-- <li class="nav-item">
                        <a class="nav-link active" href="https://www.w3schools.com/default.asp">W3schools</a>
                    </li> -->
				<li class="nav-item"><a class="nav-link"
					href="https://www.w3schools.com/default.asp">W3schools</a></li>
				<li class="nav-item"><a class="nav-link"
					href="https://pixabay.com/es/">Pixbay</a></li>
				<li class="nav-item"><a class="nav-link"
					href="https://icon-icons.com/es/">Iconos</a></li>
				<li class="nav-item"><a class="nav-link"
					href="https://www.easyredmine.com/">Redmine</a></li>
				<li class="nav-item"><a class="nav-link"
					href="https://fonts.google.com/">Google Fonts</a></li>
				<!-- <li class="nav-item">
                        <a class="nav-link disabled" href="#">Disabled</a>
                    </li> -->
			</ul>
			<hr class="d-sm-none">
		</div>
		<div class="col-sm-8">
			<img src="img/inveren.jpg" alt="Test" width="800" />

			<c:forEach var="article" items="${listArticle}">
				<h2>
					<c:out value="${article.title}" />
				</h2>
				<h5>
					<c:out value="${article.subtitle}" />
				</h5>
				<br>

				<div>
					<a href=<c:out value="${article.link}" />>holajava.herokuapp.com</a>
				</div>
				<br>
				<p>
					<c:out value="${article.text}" />
				</p>
				<br>
			</c:forEach>



			<!-- 			<h2>Crud java</h2> -->
			<!-- 			<h5>Prueba alojada en heroku, Mar 15, 2020</h5> -->
			<!-- 			<br> -->
			<!-- 			<div> -->
			<!-- 			<a href="https://holajava.herokuapp.com/">holajava.herokuapp.com</a> -->
			<!-- 			</div> -->
			<!-- 			<br> -->
			<!-- 			<p>Crud java alojado en heroku.</p> -->
			<!-- 			<br> -->

			<!-- 			<h2>App inverenlace</h2> -->
			<!-- 			<h5>Página de anuncios, Feb 6, 2020</h5> -->
			<!-- 			<br> -->
			<!-- 			<div class="fakeimg"> -->
			<!-- 							<a href="https://inverenlace.com/"><img src="img/inveren.jpg" -->
			<!-- 								alt="Inverenlace" style="width: 800px;"></a> -->
			<!-- 			</div> -->
			<!-- 			<br> -->
			<!-- 			<p>En inverenlace seleccionamos información para un grupo de -->
			<!-- 				inversores en España. Publicamos enlaces sobre análisis de bolsa y -->
			<!-- 				también filtramos anuncios de venta de inmuebles, coleccionismo, -->
			<!-- 				vehículos... Aquí puedes publicar gratis enlaces a tus anuncios y -->
			<!-- 				aparecerán diferenciados del resto.</p> -->
			<!-- 			<br> -->
		</div>
	</div>
</div>

<div class="jumbotron text-center" style="margin-bottom: 0">
	<!-- <p>&copy; 2020 Pablo Giraldo.</p> -->
	<div class="d-flex justify-content-center">
		<div>
			<a href="https://github.com/sauloop" class="fa fa-github"></a>
			<!-- <a href="https://bitbucket.org/saulop" class="fa fa-bitbucket"></a> -->
		</div>
	</div>
</div>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>

</html>