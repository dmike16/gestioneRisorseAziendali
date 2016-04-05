$('#nome').click(function(){
	$(".ricerca").empty()
	$(".ricerca").append().html(
			"<form action='GestioneCorsisti1.action' method='post'>"
			+"<fieldset><legend>Ricerca da nome e cognome</legend>"
			+"<input type='text' name='nome' placeholder='Nome'><br/>"
			+"<input type='text' name='cognome' placeholder='Cognome'><br/>"
			+"<input type='radio' name='scelta' value='studi'>Cerca per studi<br/>"
			+"<input type='radio' name='scelta' value='lavoro'> Cerca per lavori<br/>"
			+"<input type='radio' name='scelta' value='certificazioni'>Cerca per certificazioni informatiche<br/>"
			+"<input type='radio' name='scelta' value='corsi'>Cerca per corsi<br/>"
			+"<input type='submit' value='Cerca'></fieldset></form>")
	
});



$('#studio').click(function(){
	$(".ricerca").empty()

	$(".ricerca").append("<div class='blocco'><form action='GestioneCorsisti2.action' method='post'>"
	+ "<fieldset><p><label for='titoloStudio'> Inserire titolo di studio</label>"
	+ "<input type='text'></div><br/>"
	+ "<div class='collegamento'><input type='submit' value='Cerca'>"
	+ "</p></fieldset></form></div>")
		
});



$('#lavoro').click(function(){

	$(".ricerca").empty();
	$('.ricerca').append("<div class='blocco'><form action='GestioneCorsisti3.action' method='post'>"
			+ "<fieldset><p><label for='lavoro'> Inserire lavoro</label><br/>"
			+ "<input type='text'></div><br/>"
			+ "<div class='collegamento'><input type='submit' value='Cerca'>"
			+ "</p></fieldset></form></div>")
});




$('#formazione').click(function(){

	$(".ricerca").empty();

	$('.ricerca').append("<div class='blocco'<form action='GestioneCorsisti4.action' method='post'>"
			+ "<fieldset><p><label for='formazione'> Inserire formazione</label><br/>"
			+ "<input type='text'></div><br/>"
			+ "<div class='collegamento'><input type='submit' value='Cerca'>"
			+ "</p></fieldset></form></div>")

});



$('#corso').click(function(){
	
	$(".ricerca").empty();

	$('.ricerca').append("<div class='blocco'><form action='GestioneCorsisti5.action' method='post'>"
			+ "<fieldset><p><label for='corso'> Inserire nome del corso</label>"
			+ "<input type='text'></div><br/>"
			+ "<div class='collegamento'><input type='submit' value='Cerca'>"
			+ "</p></fieldset></form></div>")
});


