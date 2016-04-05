<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>


<!DOCTYPE html>
<html>
<head>
<title>Gestione Corsisti</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	

		
		<s:url value="/resources/css/bootstrap-theme.min.css" var="boot1"/>
		<s:url value="/resources/css/bootstrap.min.css" var="boot2"/>
		<s:url value="/resources/css/GestioneCorsisti.css" var="css"/>
		
		<s:url value="/resources/js/jquery-2.2.0.min.js" var="jquery"/>
		<s:url value="/resources/js/bootstrap.min.js" var="bootjs"/>
		<s:url value="/resources/js/GestioneCorsisti.js" var="corjs"/>
		
		
		<link href="${css}" rel="stylesheet"></link>
		<link href="${boot1}" rel="stylesheet"></link>
		<link href="${boot2}" rel="stylesheet"></link>
		<script src="${jquery}"></script>
		<script src="${bootjs}"></script>
		
		

</head>

<body>
	<div class="container">
		<div class = "row">
			<div class="col-md-4 menu">
				<input type="radio" name="ricerca" id="nome">Ricerca per nome</br>
				<input type="radio" name="ricerca" id="studio">Ricerca per titolo di studio</br>
				<input type="radio" name="ricerca" id="lavoro">Ricerca per lavoro</br>
				<input type="radio" name="ricerca" id="formazione">Ricerca per formazione</br>
				<input type="radio" name="ricerca" id="corso">Ricerca per corso</br>
				
			</div>
			<div class="col-md-3"></div>
			<div class="col-md-5 ricerca">
			
			</div>
		</div>
		<form:form action="tornaAlMenu.action" method="post">
			<input id="submit" type="submit" tabindex="2" 
                    value="torna al menù">
		</form:form>
	</div>
	
	
	<script src="${corjs}"></script>
</body>
</html>