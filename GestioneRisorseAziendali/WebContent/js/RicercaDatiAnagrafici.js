/**
 * Javascript per gestire le funzionalità
 * di eliminazione + modifica + view + download Cv +
 * dei candidati.
 * 
 * Basta su tecnologia Jquery
 */

//Progetto le variabili locali con una funzione 
// che viene eseguita istantaneamente
(function(){
	"use strict";
	
	jQuery(document).ready(function($){
		$("[data-toggle=modal]").on('click',function(event){
			$.ajax({
				url: "testJson.action",
				type: "GET",
				dataType: "json",
				success: function(response){
					console.log("Dati: { bella: "+ response.bella +" }");
				},
				error: function(){
					console.log("Error from server");
				}
			});
		});
	});
}());