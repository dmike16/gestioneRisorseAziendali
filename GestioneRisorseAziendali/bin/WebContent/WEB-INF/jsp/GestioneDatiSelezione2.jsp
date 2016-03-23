<!doctype html>
<html>

<head>
<title>GestioneDatiSelezione</title>

<meta charset="utf-8">
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-theme.min.css" />

<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<script src="../projektwork/js/jquery-2.2.0.min.js"></script>
<script src="../projektwork/js/bootstrap.min.js"></script>
<script src="../projektwork/js/css_browser_selector.min.js"></script>
<script src="../projektwork/js/jquery.cookie.js"></script>
<style>
.c {
	font-style: oblique
}

.coloreTesto {
	color: darkgrey
}
</style>
</head>


<body>

	<div class="apriChiudi c">Ricerca Per Altro</div>
	<div class="container fai">
		<div class="row  ">
			<form action="gestioneDatiSelezione2.action" method="post">
				<div class="col-md-12 ">

					<input type="radio" name="scelta">Test Preselettivo
				</div>

				<div class="col-md-12 ">
					<select id="candidato" name="listaTest">
						<option value="programmazioneStrutturata" />programmazioneStrutturata
						</option>
						<option value="javaSe" />javaSe
						</option>
						<option value="html5" />html5
						</option>
						<option value="sql" />sql
						</option>
						<option value="java2ee" />java2ee
						</option>
					</select>
				</div>

				<div class="col-md-3 ">
					<input type="radio" name="scelta">Intervallo Punteggio
					Batteria
				</div>
				<div class="col-md-3 ">
					<input type="text" id="max" path="max">Max</input>
				</div>
				<div class="col-md-3 ">
					<input type="text" id="min" path="min">Min</input>
				</div>

				<div class="col-md-12 ">
					<input type="radio" name="scelta">Corso <select id="corso"
						name="listaCorso">
						<options items="" />
					</select> Modulo <select id="modulo" name="listaModulo">
						<options value="" />
					</select>
				</div>

				<div class="col-md-3 ">
					<input type="radio" name="scelta">Modulo <select
						id="modulo" items="listaModulo">
						<options items="" />
					</select>
				</div>
				<div class="col-md-9 ">
					<input type="text" id="punteggio">Punteggio
					</input>

				</div>
				<div class="col-md-12 ">
					<input type="submit">
				</div>
				<div class="col-md-12 ">
					<input type="reset">
				</div>
			</form>
		</div>
	</div>
	<script src="js/doit.js"></script>
</body>



</html>