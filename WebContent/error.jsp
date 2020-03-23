<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Error</title>
<link rel="icon" type="image/x-icon" href="img/favicon.ico?v=1">
</head>
<body>
	<%
		if (exception.getMessage() == null) {
		response.sendRedirect(request.getContextPath());
	}
	%>
	<br />
	<div style="text-align: center; font-family: arial;">
		<div>
			<h1>Error</h1>
			<h2><%=exception.getMessage()%><br />
			</h2>
		</div>
	</div>

</body>
</html>