<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib prefix="portlet" uri="http://java.sun.com/portlet"%> --%>
<%@include file="headerTemplate.jsp"%>
<%
	if (request.getAttribute("fromController") == null
			|| !request.getAttribute("fromController").equals("controller")) {
		response.sendRedirect(request.getContextPath() + "/");
	}
%>
<div class="container" style="margin-top: 30px">
	<div class="row">
		<div class="col-sm-4">
			<br>
			<div>
				<a href="login.jsp"><strong>Iniciar sesión</strong></a>
			</div>
			<br> <br>

			<!-- 			<h2>Sobre mí</h2> -->
			<!-- 			<div class="aboutimg"> -->
			<!-- 				<a href="pdf/cvPabloGiraldo.pdf"><img src="img/avatar.png" -->
			<!-- 					alt="Avatar" title="Ver currículum" style="height: 200px;"></a> -->
			<!-- 			</div> -->
			<!-- 			<br> -->

			<h3>Enlaces</h3>
			<ul class="nav nav-pills flex-column">
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
			</ul>
			<!-- 			<hr class="d-sm-none"> -->
		</div>
		<br> <br>
		<div class="col-sm-8">
			<br>
			<c:forEach var="article" items="${listArticle}">
				<div>
					<div>
						<h2>
							<c:out value="${article.title}" />
						</h2>
						<h5>
							<c:out value="${article.subtitle}" />
						</h5>
					</div>
					<br>

					<!-- 					<div class="fakeimg"> -->
					<!-- 						<a href="https://inverenlace.com/"><img -->
					<%-- 							src="<%=request.getContextPath()%>/img/inveren.jpg" --%>
					<!-- 							alt="Inverenlace" style="width: 800px;" /></a> -->
					<!-- 					</div> -->

					<div>
						<a href=<c:out value="${article.link}" />><c:out
								value="${article.link}" /></a>
					</div>
					<br>

					<div>
						<p>
							<c:out value="${article.text}" />
						</p>
					</div>
				</div>
				<br>
				<br>
			</c:forEach>
		</div>
	</div>
</div>
<br>
<%@include file="footerTemplate.jsp"%>
