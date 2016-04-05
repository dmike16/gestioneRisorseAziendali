<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<s:url value="/resources/css/bootstrap-theme.min.css" var="boot1" />
<s:url value="/resources/css/bootstrap.min.css" var="boot2" />
<s:url value="/resources/css/style.css" var="boot3" />
<s:url value="/resources/css/GestioneDatiSelezione.css" var="boot4" />


<s:url value="/resources/js/jquery-2.2.0.min.js" var="jquery" />
<s:url value="/resources/js/bootstrap.min.js" var="bootjs" />
<s:url value="/resources/js/GestioneDatiSelezione.js" var="gestjs" />

<link href="${boot1}" rel="stylesheet"></link>
<link href="${boot2}" rel="stylesheet"></link>
<script src="${jquery}"></script>
<script src="${bootjs}"></script>
</head>

<body>
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
						<form:form commandName="ricercascelta" modelAttribute="ricerca"
							action="gestioneDatiSelezione.action" method="post">
							<div class="form-group">

								<label for="nome"> <form:input id="nome" path="nome"
										placeholder="nome" />
								</label>
							</div>

							<div class="form-group">
								<label for="cognome"> <form:input id="cognome"
										path="cognome" placeholder="cognome" />
								</label>
							</div>

							



							<p>
								<form:radiobutton id="batterieTest" name="ricerca"
									path="scelta" value="batterieTest" />
								<label for="batterieTest">Batterie test</label> <br />
								<form:radiobutton id="valutazioniOsservazioniColloquio"
									name="ricerca" path="scelta"
									value="valutazioniOsservazioniColloquio" />
								<label for="valutazioniOsservazioniColloquio">Valutazione
									e osservazioni colloquio</label> <br />
								<form:radiobutton id="potenzialita" name="ricerca"
									path="scelta" value="potenzialita" />
								<label for="potenzialita">Potenzialita </label> <br />
								<form:radiobutton id="profiloCaratteriale" name="ricerca"
									path="scelta" value="profiloCaratteriale" />
								<label for="profiloCaratteriale">Profilo caratteriale</label> <br />
								<form:radiobutton id="moduli" name="ricerca" path="scelta"
									value="moduli" />
								<label for="moduli">Moduli</label> <br />
								<form:radiobutton id="modulo" name="ricerca" path="scelta"
									value="modulo" />
								<label for="modulo">Modulo:</label> <br /> <input type="text"
									id="moduloText" value="moduloText" />
							</p>

							<p id="buttons">
								<input id="reset" type="reset"/> <input id="submit"
									type="submit" value="Cerca"/>
							</p>
						</form:form>

					</section>

				</div>

			</div>
			<div class="row main2" style="display: none">
				<form:form action="gestioneDatiSelezione2.action" method="post">
					<fieldset>
						<input type="radio" name="scelta" id="testPreselettivo"
							value="testPreselettivo" checked> <label
							for="testPreselettivo">Test preselettivo</label> <select
							id="listaTest" name="listaTest">
							<c:forEach items="${tests}" var="test">
								<option value="${test}">seleziona test1</option>
							</c:forEach>
						</select> <br /> <input id="reset" type="reset"> <input id="submit"
							type="submit" value="Cerca">
					</fieldset>
				</form:form>


				<form:form action="gestioneDatiSelezione3.action" method="post">
					<fieldset>
						<input type="radio" name="scelta" id="intervalloPunteggio"
							value="intervalloPunteggio"> <label
							for="intervalloPunteggio">Intervallo Punteggio Batteria</label> <input
							type="text" id="max" placeholder="max" disabled="true" /> <input
							type="text" id="min" placeholder="min" disabled="true" /> <br />
						<input id="reset" type="reset"> <input id="submit"
							type="submit" value="Cerca">
					</fieldset>
				</form:form>

				<form:form action="gestioneDatiSelezione4.action" method="post">
					<fieldset>
						<input type="radio" name="scelta" id="corsoModulo"
							value="corsoModulo" /> <label for="listaCorsi">Corso</label> <select
							id="listaCorsi" name="listaCorsi">
							<c:forEach items="${corsi}" var="corso">
								<option value="${corso}">${corso}</option>
							</c:forEach>
						</select> <label for="listaModuli">Modulo</label> <select id="listaModuli"
							name="listaModuli">
							<c:forEach items="${moduli}" var="modulo">
								<option value="${modulo}">${modulo}</option>
							</c:forEach>
						</select> <br /> <input id="reset" type="reset"> <input id="submit"
							type="submit" value="Cerca">
					</fieldset>
				</form:form>

				<form:form action="gestioneDatiSelezione5.action" method="post">
					<fieldset>
						<input type="radio" name="scelta" id="moduloPunteggio"
							value="moduloPunteggio" /> <label for="listaModuli2">Modulo</label>
						<select id="listaModuli2" name="listaModuli2">
							<c:forEach items="${moduli}" var="modulo">
								<option value="${modulo}">${modulo}</option>
							</c:forEach>
						</select> <label for="punteggio">Punteggio</label> <input id="punteggio"
							type="text" disabled="true" />
						<p id="buttons">
							<input id="reset" type="reset"> <input id="submit"
								type="submit" value="Cerca">
						</p>
					</fieldset>
				</form:form>
			</div>
	</div>
	
	<script src="${gestjs}"></script>
</body>
</html>