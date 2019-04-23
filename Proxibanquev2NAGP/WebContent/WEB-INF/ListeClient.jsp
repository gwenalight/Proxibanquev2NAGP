<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="ServletEffectuerVirement">
		<div class="parta">
			<h1>Liste de vos Clients</h1>
			<c:forEach items="${Client}" var="c"}>
			<p/> ${c.name}  
			${c.firstName}
			<!-- il faut configurrer cette partie avec les clients qu'a crer Nawal -->
			</c:forEach>
		</div>

		<div class="partc">
			<input type="submit" value="envoyer" /> <input type="reset"
				value="reset" />
			<p />
		</div>
</body>
</html>