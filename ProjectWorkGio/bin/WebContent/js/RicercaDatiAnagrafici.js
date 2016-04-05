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
		$("button.elimina").on('click',function(event){
			
			$.ajax({
				url: "testJson.action",
				type: "GET",
				dataType: "json",
				success: function(response){
					$('.modal-header').empty();
					$('.modal-header').append("<h2>" + "Dati Candidato" + "</h2>");
					
					$('.modal-body').empty();
					
					var html=['<ul>'];
					response.libri.forEach(function(element){
						var s = "<li>"+element.titolo+"</li>"+
						"<li>"+element.autore+"</li>"+
						"<li>"+element.id+"</li>"+
						"<li>"+element.prezzo+"</li>";
						
						html.push(s);
					});
					
					$('.modal-body').append(html.concat(' '));
					$('.modal-footer').empty();
					$('.modal-footer').append('<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>' +
							'<a href="cancellaDatiAnagrafici.action" class="btn btn-primary">Cancella</a>');
					console.log(response.libri);
				},
				error: function(){
					console.log("Error from server");
				}
			});
		});
	});
}());