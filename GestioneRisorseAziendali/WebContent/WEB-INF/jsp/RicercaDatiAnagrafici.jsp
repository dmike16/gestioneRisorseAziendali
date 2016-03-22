<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="css/bootstrap-theme.min.css"/>
<link rel="stylesheet" type="text/css" href="css/RicercaDatiAnagrafici.css"/>
<script src="js/jquery-2.2.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
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
							<p class="text-danger">${nomeCognomeError}</p>
						</c:if>
						<form action="ricercaDatiAnagrafici1.action" method="post">
							<div class="form-group">
								<label for="nome"> <form:input id="nome"
										class="form-control" path="nome" placeholder="nome" />
								</label>
							</div>

							<div class="form-group">
								<label for="cognome"> <form:input id="cognome"
										class="form-control" path="cognome" placeholder="cognome" />
								</label>
							</div>

							<button class="btn btn-default" type="submit">Cerca</button>
						</form>
					</section>
				</div>
				<div class="col-md-2"></div>
				<div class="col-md-5">
					<section>
						<h2>Ricerca per email</h2>
						
						<%-- Messaggio di Errore in caso entrambi campi nulli --%>
						<c:if test="${emailError != null}">
							<p class="text-danger">${emailError}</p>
						</c:if>
						<form action="ricercaDatiAnagrafici2.action">
							<div class="form-group">
								<label for="nome"><input id="nome" class="form-control"
									name="email" type="email" placeholder="email" /> </label>
							</div>

							<button class="btn btn-default" type="submit">Cerca</button>
						</form>
					</section>
				</div>
			</div>
		</section>
		
		<%-- Parte lista  --%>
		<div class="row titleTable">
			<div class="col-md-1">
				<img src="img/pointRed.png" class="icon" />
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
					<img src="img/pointGreen.png" class="icon" />
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
	<script src="js/RicercaDatiAnagrafici.js"></script>
</body>
</html>