<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Gestione Corsisti</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<link rel="stylesheet" href="css/bootstrap.min.css"></link>
		<link rel="stylesheet" href="css/bootstrap-theme.min.css"></link>
		<link rel="stylesheet" href="css/GestioneCorsisti.css"></link>
<script src="js/jquery-2.2.0.min.js"></script>
</head>
<body>
	<!-- Ricerca -->
	<div class="container">
		<div class = "row">
			<div class="col-md-4 menu">
				<input type="radio" id="nome">Ricerca per nome</br>
				<input type="radio" id="studio">Ricerca per titolo di studio</br>
				<input type="radio" id="lavoro">Ricerca per lavoro</br>
				<input type="radio" id="formazione">Ricerca per formazione</br>
				<input type="radio" id="corso">Ricerca per corso</br>
				
			</div>
			<div class="col-md-3"></div>
			<div class="col-md-5 ricerca"></div>
		</div>
		
		<!-- VISUALIZZAZIONE -->
		<div class="row">
			
				<c:forEach var="datoAnagrafica" items="${anagrafica}">
					<div class="col-md-5">
					<p>nome:${datoAnagrafica.nome} cognome:${datoAnagrafica.cognome} </p>
					</div>
					<div class="col-md-5">
						<c:forEach var="datiLavoro" items="${lavori}">
							<p> ${datiLavoro}</p>
						</c:forEach>
						<c:forEach var="datiCertificazioni" items="${certificazioni }">
							<p>${datiCertificazioni }</p>
						</c:forEach>
						<c:forEach var="datiCorso" items="${corsi }">
							<p>${datiCorso }
						</c:forEach>
						<c:forEach var="voto" items="${voto }">
							<p>${voto }</p>
						</c:forEach>
					</div>
					<div class="col-md-2">
						<c:forEach var="datiAzenda" items="${aziende }">
							<p>${datiAzienda}</p>
						</c:forEach>
					</div>
				</c:forEach>
			
			<div class="col-md-5">
				<ul>
				<c:forEach var="datiStudi" items="${formazione }">
				<li><p> titolo di studio :${datiStudi.titoloStudio} </p>
				</c:forEach>
			</div>
		</div>
		<input id ="submit" type="submit" action="Index.html" value="Ritorna Al Menu Principale">
	</div>
</body>
</html>
