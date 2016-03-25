
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Classe usata da spring come controller per
 * gestire i Corsisti. 
 * 
 *
 */

@Controller
public class ControllerGestioneCorsisti {
	
	/**
	 * Metodo che rimanda la jsp che contiente tutte le form
	 * per la gestione dei corsisti
	 * 
	 * @return String index jsp
	 */
	@RequestMapping("gestioneCorsisti.action")
	public String gestioneCorsistiIndex(){
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca tramite nome
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti1.action")
	public String ricercaPerNome(){
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca tramite titolo
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsiti2.action")
	public String ricercaPerTitolo(){
		return "GestioneCorsisti";
	}
	
	
	/**
	 * Metodo che interroga il database per la ricerca tramite Lavoro
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti3.action")
	public String ricercaPerLavoro(){
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca per formazione
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti4.action")
	public String ricercaPerFormazione(){
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca per corso
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti5.action")
	public String ricercaPerCorso(){
		return "GestioneCorsisti";
	}
}
