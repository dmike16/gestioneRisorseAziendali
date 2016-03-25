/**
 * 
 * Basta su tecnologia Jquery
 */

//Proteggo le variabili locali con una funzione 
// che viene eseguita istantaneamente
(function(){
	"use strict";
	
	//Compie una chiamata AJAX al server per popolare la modal
	jQuery(document).ready(function($){
		$("button.elimina").on('click',function(event){
			
			// Se c'è stato un errore in precedenza cancella l'alert
			if($('.alert-danger').length !== 0){
				$('.alert-danger').remove();
			}
			
			$.ajax({
				url: "//Inserire l'url della richiesta al server",
				type: "GET",
				dataType: "json",
				success: function(response){
					
					/* Se la chiamata al server ha esito positivo
					*  allora la modal viene popolata
					*  usando l'oggetto response, ottenuto tramite un parse della risposta del server
					*  che sarà di tipo JSON.
					*  Nel caso si cambino gli attributi del JSON cambiare con i rispettivi nomi, gli attributi di response
					*/
					
					var $modal_header = $('.modal-header'); 
					
					$modal_header.empty();
					$modal_header.html("<h2>" + "Dati Candidato" + "</h2>");
					
					var $modal_body = $('.modal-body'); 
					$modal_body.empty();
					
					var html=['<ul>'];
					response.libri.forEach(function(element){
						var s = "<li>"+element.titolo+"</li>"+
						"<li>"+element.autore+"</li>"+
						"<li>"+element.id+"</li>"+
						"<li>"+element.prezzo+"</li>";
						
						html.push(s);
					});
					
					$modal_body.html(html.concat(' '));
					
					var $modal_footer = $('.modal-footer'); 
					$modal_footer.empty();
					$modal_footer.append('<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>' +
							'<a href="cancellaDatiAnagrafici.action" class="btn btn-primary">Cancella</a>');
					console.log(response.libri);
				},
				error: function(xhr,status,errorThrown){
					
					// In caso di errore appenda al container un alert
					$('.container').append('<div class="alert alert-danger alert-dimissable">'+
							'<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>'+
							status+' </div>');
					console.log(status);
					console.log(errorThrown);
				}
			});
		});
	});
}());
