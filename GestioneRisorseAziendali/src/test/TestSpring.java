package test;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Classe che rappresenta il controller usato da spring
 * per gestire la ricerca dei candidati per dati anagrafici
 *
 *	@version 1.0
 */
@Controller
public class TestSpring {
	
	/**
	 * Metodo usato per mappare l'action indexRicerca.action	
	 * @return 			jsp che rappresenta la pagina iniziale della ricerca
	 */
	@RequestMapping("indexRicerca.action")
	public String index(){
		return "RicercaDatiAnagrafici";
	}
	
	/**
	 * Metodo che mappa il primo form di ricerca. Ricerca per nome e cognome.
	 * Se sono entrambi vuoti genera un messaggio di errore
	 * 
	 * @param ricerca 			Mappa stringa,string dove la chiave è li name dell'input tag e il valore il corrispondete valore
	 * @param model				Rappresenta l'interfaccia model definita da spring
	 * @see <a href="https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/ui/Model.html">Model</a>
	 * @return					jsp che rappresenta la pagina iniziali della ricerca
	 */
	@RequestMapping("ricercaDatiAnagrafici1.action")
	public String testFormSpring(@RequestParam Map<String,String> ricerca, Model model){
		
		if(ricerca.get("nome").isEmpty() && ricerca.get("cognome").isEmpty()){
			model.addAttribute("nomeCognomeError","Entrambi i campi nulli");
		}
		
		model.addAllAttributes(ricerca);
		
		return "RicercaDatiAnagrafici";
	}
	
	/**
	 * Metodo che mappa il secondo form di ricerca. Ricerca per email.
	 * Se è vuoto genera un errore
	 * 
	 * @param email		Il valore inserito nell' input tag con attributo {@code name="email"}
	 * @param model		Rappresenta l'interfaccia model definita da spring
	 * @see <a href="https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/ui/Model.html">Model</a>
	 * @return
	 */
	@RequestMapping("ricercaDatiAnagrafici2.action")
	public String testFromSpring(@RequestParam("email") String email, Model model){
		
		
		if(email.isEmpty()){
			model.addAttribute("emailError", "Email vuota");
		}
		model.addAttribute("email", email);
		
		return "RicercaDatiAnagrafici";
	}
}
