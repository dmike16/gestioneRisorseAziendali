$('#parNome').click(function(){
	$("#studio").empty();
	$("#lavoro").empty();
	$("#formazione").empty();
	$("#corso").empty();
	/*$("#studio").append("<p id='parStudio'>Ricerca per titolo di studio</p>");
	console.log("appeso paragrafo studio");
	$("#lavoro").append().html("<p id='parLavoro'>Ricerca per lavoro</p>");
	console.log("appeso paragrafo lavoro");
	$("#formazione").append().html("<p id='parFormazione'>Ricerca per formazione</p>");
	console.log("appeso paragrafo formazione");
	$("#corso").append().html("<p id='parCorso'>Ricerca per corso</p>");
	console.log("appeso paragrafo corso");*/
	$("#nome").append().html(
			"<form action='GestioneCorsisti1.action' method='post'>"
			+"<fieldset><legend>Ricerca da nome e cognome</legend>"
			+"<input type='text' name='nome' placeholder='Nome'><br/>"
			+"<input type='text' name='cognome' placeholder='Cognome'><br/>"
			+"<input type='checkbox' name='scelta' value='studi'>Cerca per studi<br/>"
			+"<input type='checkbox' name='scelta' value='lavoro'> Cerca per lavori<br/>"
			+"<input type='checkbox' name='scelta' value='certificazioni'>Cerca per certificazioni informatiche<br/>"
			+"<input type='checkbox' name='scelta' value='corsi'>Cerca per corsi<br/>"
			+"<input type='submit' value='Cerca'></fieldset></form>")
	/*"<form: form commandName='candidato' action='GestioneCorsisti1.action' method='post'>"
	+ "<fieldset><legend>inserisci nome</legend>"
	+ "<p class='errorLine'> <form: errors path='nome' cssClass='error /></p>'"
	+ "<p><label for='nome'>Inserire nome</label>"
	+ "<form:input id='nome' path='nome' /></p>"
	+ "<p class='errorLine'> <form:errors path='cognome' cssClass='error'/></p>"
	+ "<p><form:input name='cognome' path='cognome' /></p>"
	+ "<p><input type='radio' name='scelta' value='1'> studi<br/>"
	+ "<p><input type='radio' name='scelta' value='2'> lavoro<br/>"
	+ "<p><input type='radio' name='scelta' value='3'> certificazioni<br/>"
	+ "<p><input type='radio' name='scelta' value='4'> corsi<br/>"
	+ "<input type='submit' value='Cerca'>"
	+ "</fieldset></form:form>")*/
});

/*$('#nome').mouseleave(function(){
	$('#nome').empty();
	$('#nome').append('Ricerca Per Nome')
});*/


$('#parStudio').click(function(){
	$("#nome").empty();
	$("#lavoro").empty();
	$("#formazione").empty();
	$("#corso").empty();
	/*//$("#nome").empty();
	//console.log("svuotato nome");
	$("#nome").append("<p id='parNome'>Ricerca per nome</p>");
	console.log("appeso paragrafo nome");
	//$("#lavoro").empty();
	//console.log("svuotato lavoro");
	$("#lavoro").append("<p id='parLavoro'>Ricerca per lavoro</p>");
	console.log("appeso paragrafo lavoro");
	//$("#formazione").empty();
	//console.log("svuotato formazione");
	$("#formazione").append("<p id='parFormazione'>Ricerca per formazione</p>");
	console.log("appeso paragrafo formazione");
	//$("#corso").empty();
	//console.log("svuotato corso");
	$("#corso").append("<p id='parCorso'>Ricerca per corso</p>");
	console.log("appeso paragrafo corso");*/
	$("#studio").append("<div class='blocco'><form action='GestioneCorsisti2.action' method='post'>"
	+ "<fieldset><p><label for='titoloStudio'> Inserire titolo di studio</label>"
	+ "<input type='text'></div><br/>"
	+ "<div class='collegamento'><input type='submit' value='Cerca'>"
	+ "</p></fieldset></form></div>")
		
});

/*$('#studio').mouseleave(function(){
	$('#studio').empty();
	$('#studio').append('Ricerca per titolo di studio')
});*/


$('#parLavoro').click(function(){
	$("#nome").empty();
	$("#studio").empty();
	$("#formazione").empty();
	$("#corso").empty();
	/*//$('#lavoro').empty();
	//$("#nome").empty();
	//console.log("svuotato nome");
	$("#nome").append("<p id='parNome'>Ricerca per nome</p>");
	console.log("appeso paragrafo nome");
	//$("#studio").empty();
	//console.log("svuotato studio");
	$("#studio").append("<p id='parStudio'>Ricerca per titolo di studio</p>");
	console.log("appeso paragrafo studio");
	//$("#formazione").empty();
	//console.log("svuotato formazione");
	$("#formazione").append("<p id='parFormazione'>Ricerca per formazione</p>");
	console.log("appeso paragrafo formazione");
	//$("#corso").empty();
	//console.log("svuotato corso");
	$("#corso").append("<p id='parCorso'>Ricerca per corso</p>");
	console.log("appeso paragrafo corso");*/
	$('#lavoro').append("<div class='blocco'><form action='GestioneCorsisti3.action' method='post'>"
			+ "<fieldset><p><label for='lavoro'> Inserire lavoro</label><br/>"
			+ "<input type='text'></div><br/>"
			+ "<div class='collegamento'><input type='submit' value='Cerca'>"
			+ "</p></fieldset></form></div>")
	/*$('#lavoro').append().html("<form action='GestioneCorsisti3.action' method='post'>"
	+ "<fieldset><p><label for='lavoro'> Inserire lavoro</label>"
	+ "<input type='text' id='lavoro' name='lavoro'><td/>"
	+ "<input type='submit' value='Cerca'>"
	+ "</p></fieldset></form>")*/
});

/*$('#lavoro').mouseleave(function(){
	$('#lavoro').empty();
	$('#lavoro').append('Ricerca per lavoro')
});*/


$('#parFormazione').click(function(){
	$("#nome").empty();
	$("#studio").empty();
	$("#lavoro").empty();
	$("#corso").empty();
	/*//$('#formazione').empty();
	//$('#formazione').append('Ricerca per formazione');
	//$("#nome").empty();
	//console.log("svuotato nome");
	$("#nome").append("<p id='parNome'>Ricerca per nome</p>");
	console.log("appeso paragrafo nome");
	//$("#studio").empty();
	//console.log("svuotato studio");
	$("#studio").append("<p id='parStudio'>Ricerca per titolo di studio</p>");
	console.log("appeso paragrafo studio");
	//$("#lavoro").empty();
	//console.log("svuotato lavoro");
	$("#lavoro").append("<p id='parLavoro'>Ricerca per lavoro</p>");
	console.log("appeso paragrafo lavoro");
	//$("#corso").empty();
	//console.log("svuotato corso");
	$("#corso").append("<p id='parCorso'>Ricerca per corso</p>");
	console.log("appeso paragrafo corso");*/
	$('#formazione').append("<div class='blocco'<form action='GestioneCorsisti4.action' method='post'>"
			+ "<fieldset><p><label for='formazione'> Inserire formazione</label><br/>"
			+ "<input type='text'></div><br/>"
			+ "<div class='collegamento'><input type='submit' value='Cerca'>"
			+ "</p></fieldset></form></div>")
	/*$('#formazione').append().html("<form action='GestioneCorsisti4.action' method='post'>"
	+ "<fieldset><p><label for='formazione'> Inserire formazione</label>"
	+ "<input type='text' id='formazione' name='formazione'>"
	+ "<input type='submit' value='Cerca'>"
	+ "</p></fieldset></form>")*/
});

/*$('#formazione').mouseleave(function(){
	$('#formazione').empty();
	$('#formazione').append('Ricerca per formazione')
});*/


$('#parCorso').click(function(){
	$("#nome").empty();
	$("#studio").empty();
	$("#lavoro").empty();
	$("#formazione").empty();
	/*//$('#corso').empty();$("#studio").empty();
	//$("#nome").empty();
	//console.log("svuotato nome");
	$("#nome").append('<p class="parNome">Ricerca per nome</p>');
	console.log("appeso paragrafo nome");
	//$("#studio").empty();
	//console.log("svuotato studio");
	$("#studio").append("<p id='parStudio'>Ricerca per titolo di studio</p>");
	console.log("appeso paragrafo studio");
	//$("#lavoro").empty();
	//console.log("svuotato lavoro");
	$("#lavoro").append("<p id='parLavoro'>Ricerca per lavoro</p>");
	console.log("appeso paragrafo lavoro");
	//$("#formazione").empty();
	//console.log("svuotato formazione");
	$("#formazione").append("<p id='parFormazione'>Ricerca per formazione</p>");
	console.log("appeso paragrafo formazione");*/
	$('#corso').append("<div class='blocco'><form action='GestioneCorsisti5.action' method='post'>"
			+ "<fieldset><p><label for='corso'> Inserire nome del corso</label>"
			+ "<input type='text'></div><br/>"
			+ "<div class='collegamento'><input type='submit' value='Cerca'>"
			+ "</p></fieldset></form></div>")
	/*$('#corso').append().html("<form action='GestioneCorsisti5.action' method='post'>"
	+ "<fieldset><p><label for='corso'> Inserire nome corso</label>"
	+ "<input type='text' id='corso' name='corso'><td/>"
	+ "<input type='submit' value='Cerca'>"
	+ "</p></fieldset></form>")*/
});

/*$('#corso').mouseleave(function(){
	$('#corso').empty();
	$('#corso').append('Ricerca per corso')
});*/