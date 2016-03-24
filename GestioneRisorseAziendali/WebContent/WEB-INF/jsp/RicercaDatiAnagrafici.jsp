<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="css/bootstrap-theme.min.css" />
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
								<label for="nome"> <input id="nome" name="nome"
									class="form-control" placeholder="nome" value="${ricerca.nome}" />
								</label>
							</div>

							<div class="form-group">
								<label for="cognome"> <input id="cognome" name="cognome"
									class="form-control" placeholder="cognome"
									value="${ricerca.cognome}" />
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
								<label for="nome"><input id="nome" name="email"
									class="form-control" name="email" type="email"
									placeholder="email" value="${email}" /> </label>
							</div>

							<button class="btn btn-default" type="submit">Cerca</button>
						</form>
					</section>
				</div>
			</div>
		</section>

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
					<p class="sprite elimina"></p>
					<p class="sprite modifica"></p>
					<p class="sprite view"></p>
					<p class="sprite scarica"></p>
				</div>
			</div>
		</c:forEach>
	</div>
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	<script src="js/RicercaDatiAnagrafici.js"></script>
</body>
</html>