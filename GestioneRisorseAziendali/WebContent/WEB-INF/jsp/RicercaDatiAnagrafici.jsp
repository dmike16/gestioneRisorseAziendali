<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
<style type="text/css">@import url("<c:url value="/css/bootstrap.min.css"/>");</style>
<style type="text/css">@import url("<c:url value="/css/bootstrap-theme.min.css"/>");</style>
<script src="../../js/jquery-2.2.0.min.js"></script>
<script src="../../js/bootstrap.min.js"></script>
<title>Ricerca Dati Anagrafici</title>
</head>
<body>
	<div class="container effect">
		<div class="row titleTable">
            <div class="col-md-1">
                <img src="img/pointRed.png" class="icon"/>
            </div>
			<div class="col-md-2">
				<h3>Nome</h3>
			</div>
			<div class="col-md-2">
				<h3>Cognome</h3>
			</div>
			<div class="col-md-2">
				<h3>Cellulare</h3>
			</div>
			<div class="col-md-2">
				<h3>E-Mail</h3>
			</div>
			<div class="col-md-3">
                <p class="sprite elimina"></p>
				<p class="sprite modifica"></p>
				<p class="sprite view"></p>
				<p class="sprite scarica"></p>
			</div>
        </div>
				<c:forEach var="DatoAnagrafico" items="${listaCandidato }">
						<div class="row list">
				            <div class="col-md-1">
				            <img src="img/pointGreen.png" class="icon"/>
				            </div>
				            <div class="col-md-2">
								<h3>${DatoAnagrafico.nome }</h3>
							</div>
							<div class="col-md-2">
								<h3>${DatoAnagrafico.cognome }</h3>
							</div>
							<div class="col-md-2">
								<h3>${DatoAnagrafico.cellulare }</h3>
							</div>
							<div class="col-md-2">
								<h3>${DatoAnagrafico.email }</h3>
							</div>
							<div class="col-md-3">
				                <p class="sprite elimina"></p>
								<p class="sprite modifica"></p>
								<p class="sprite view"></p>
								<p class="sprite scarica"></p>
							</div>
	        			</div>
				</c:forEach>
			
		
		
		</div>
	<script src="../../js/RicercaDatiAnagrafici.js"></script>
</body>
</html>