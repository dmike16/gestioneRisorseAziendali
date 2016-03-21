<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>Ricerca Dati Anagrafici</title>
</head>
<body>
	<%-- Contenitore principale per tecnologia BootStrap --%>
	<div class="container">
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
						<form:form action="ricercaDatiAnagrafici1.action"
							commandName="AnagraficaCandidato">
							<div class="form-group">
								<label for="nome"> <form:input id="nome"
										class="form-control" path="nome" placeholder="nome" />
										<form:errors class="text-danger" path="nome"/>
								</label>
							</div>

							<div class="form-group">
								<label for="cognome"> <form:input id="cognome"
										class="form-control" path="cognome" placeholder="cognome" />
									<form:errors class="text-danger" path="cognome"/>
								</label>
							</div>

							<button class="btn btn-default" type="submit">Cerca</button>
						</form:form>
					</section>
				</div>
				<div class="col-md-2"></div>
				<div class="col-md-5">
					<section>
						<h2>Ricerca per email</h2>
						<form  action="ricercaDatiAnagrafici2.action">
							<div class="form-group">
								<label for="nome"><input id="nome" class="form-control" name="email"
									type="email" placeholder="email"/> </label>
							</div>

							<button class="btn btn-default" type="submit">Cerca</button>
						</form>
					</section>
				</div>
			</div>
		</section>
	</div>
</body>
</html>