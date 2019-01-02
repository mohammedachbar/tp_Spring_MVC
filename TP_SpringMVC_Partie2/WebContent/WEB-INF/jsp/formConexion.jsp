<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulaire de connexion</title>
</head>
<body>
<h2>Information de connexion</h2>
<form:form method="POST" action="t_connexion">
	<table>
	<tr>
		<td><form:label path="login">Login</form:label></td>
		<td><form:input path="login" /></td>
	</tr>
	<tr>
		<td><form:label path="pass">Mot de passe</form:label></td>
		<td><form:input path="pass" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Se connecter"/>
		</td>
	</tr>
</table>
</form:form>
</body>
</html>