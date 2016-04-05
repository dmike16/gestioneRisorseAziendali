<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />

	
		<s:url value="/resources/css/bootstrap-theme.min.css" var="boot1"/>
		<s:url value="/resources/css/bootstrap.min.css" var="boot2"/>
		<s:url value="/resources/css/RicercaDatiAnagrafici.css" var="css"/>
		
		<s:url value="/resources/js/jquery-2.2.0.min.js" var="jquery"/>
		<s:url value="/resources/js/bootstrap.min.js" var="bootjs"/>
		<s:url value="/resources/js/RicercaDatiAnagrafici.js" var="corjs"/>
		
		<s:url value="/resources/img/pointRed.png" var="pointred"/>
		
		<link href="${css}" rel="stylesheet"></link>
		<link href="${boot1}" rel="stylesheet"></link>
		<link href="${boot2}" rel="stylesheet"></link>
		<script src="${jquery}"></script>
		<script src="${bootjs}"></script>
		


<title>Ricerca Dati Anagrafici</title>
</head>

<body>
	<div class="container effect">
		<section>

			<%--Prima riga contentene il titolo dell azione principale 
			divisa in 3col 6col 3col --%>
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<h1>Ricerca Dati Anagrafici</h1>
				</div>
				<div class="col-md-3"></div>
			</div>

			<%--Seconda riga contente i due form di ricerca 
			divisa in 5col 2col 5col--%>
			<div class="row">
				<div class="col-md-5">
					<section>
						<h2>Ricerca per nome</h2>
			
						<%-- Messaggio di Errore in caso entrambi campi nulli --%>
						<c:if test="${nomeCognomeError != null}">
							<p class="text-danger">${requestScope.nomeCognomeError}</p>
						</c:if>
						<form:form commandName="RicercaScelta" modelAttribute="ricerca" action="ricercaDatiAnagrafici1.action" method="post">
							<div class="form-group">
								
								<label for="nome"> 
								<form:input id="nome"  path="nome" placeholder="nome" />
								</label>
							</div>

							<div class="form-group">
								<label for="cognome"> 
								<form:input id="cognome" path="cognome" placeholder="cognome" />
								</label>
							</div>

							<button class="btn btn-default" type="submit">Cerca</button>
						</form:form>
					</section>
				</div>
				
			</div>
		</section>
		
		<%-- Parte lista  --%>
		<div class="row titleTable">
			<div class="col-md-1">
				
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
		
		</div>
		<c:forEach var="Candidato" items="${requestScope.listaCandidato}">
			<div class="row list">
				<div class="col-md-1">
					<img src="/resources/img/pointGreen.png" class="icon" />
				</div>
				<div class="col-md-2">
					<h3>${Candidato.nome}</h3>
					<c:out value="${Candidato.nome}"/>
				</div>
				<div class="col-md-2">
					<h3>${Candidato.cognome}</h3>
				</div>
				<div class="col-md-2">
					<h3>${Candidato.cellulare}</h3>
				</div>
				<div class="col-md-2">
					<h3>${Candidato.email}</h3>
				</div>
				<div class="col-md-3">
					<button type="button" class="sprite elimina"
						data-toggle="modal" data-target="#myModal">
					</button>
					<button type="button" class="sprite modifica"
						data-toggle="modal" data-target="#myModal">
					</button>
					<button type="button" class="sprite view"
						data-toggle="modal" data-target="#myModal">
					</button>
					<button type="button" class="sprite scarica"
						data-toggle="modal" data-target="#myModal">
					</button>
				</div>
			</div>
		</c:forEach>



	</div>
	<script src="${corjs}"></script>
	
</body>
</html>