
package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.RicercaScelta;
import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.Azienda;
import domain.anagrafica.Formazione;
import domain.anagrafica.Lavoro;
import domain.corso.Corso;

/**
 * Classe usata da spring come controller per
 * gestire i Corsisti. 
 * 
 *
 */


@Controller
public class ControllerGestioneCorsisti {
	
	//----implementazione della classe con le query----
	private DBGestioneCorsisti gestione = new DBGestioneCorsist();
	
	/**
	 * Metodo che rimanda la jsp che contiente tutte le form
	 * per la gestione dei corsisti
	 * 
	 * @return String index jsp
	 */
	@RequestMapping("gestioneCorsisti.action")
	public String gestioneCorsistiIndex(BindingResult bindingResult ,Model model){
		//TODO ritornare alla pagina precedente
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca tramite nome e permette di selezionare per : studi , lavoro ,
	 *  certificazioni, corsi
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti1.action")
	public String ricercaPerNome(@Valid @ModelAttribute RicercaScelta ricercaScelta, BindingResult bindingResult ,Model model){
		if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "GestioneCorsisti";
        }
		model.addAttribute("anagrafica",ricercaScelta);
		String scelta = ricercaScelta.getScelta();
		
		//----esegue la query a seconda della scelta presa nella radio----
		if(scelta.equals("studi")){
			ArrayList<Formazione> listFormazione = gestione.selectFormazioneCorsisti(ricercaScelta);
			model.addAttribute("studio", listFormazione);
		}
		else if(scelta.equals("lavoro")){
			List<Lavoro> listaLavori = gestione.selectLavoriCorsisti(ricercaScelta);
			List<Azienda> listaAziende = gestione.selectAziendeCorsisti(ricercaScelta);
			model.addAttribute("lavori",listaLavori);
			model.addAttribute("aziende",listaAziende);
		}
		
		else if (scelta.equals("certificazioni")){
			List<String> certificazioni = gestione.selectCompetenzeInformaticheCorsisti(ricercaScelta);
			model.addAttribute("certificazioni" , certificazioni);
		}
		
		else if(scelta.equals("corsi")){
			List<Corso> listaCorsi = gestione.selectCorsiCorsisti(ricercaScelta);
			model.addAttribute ("corsi",listaCorsi);
		}
		
		return "GestioneCorsisti";
	}
	
	/**
	 * Selezionando un certo titolo di studi,compariranno tutti i corsisti che lo possiedono con relativi voti
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsiti2.action")
	public String ricercaPerTitolo(@Valid @ModelAttribute AnagraficaCandidato anagraficaCandidato, BindingResult bindingResult ,Model model){
		if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "GestioneCorsisti";
        }
		List<AnagraficaCandidato> listaAnagraficaCandidato = gestione.selectCorsistiPerStudio(anagraficaCandidato.getTitoloStudio());
		List<AnagraficaCandidato> listaFormazione = gestione.selectCorsistiPerVotoStudio(anagraficaCandidato.getTitoloStudio());
		model.addAttribute("anagrafica" , listaAnagraficaCandidato);
		model.addAttribute("voto" , listaFormazione);
		
		return "GestioneCorsisti";
	}
	
	
	/**
	 * Metodo che interroga il database per la ricerca tramite Lavoro
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti3.action")
	public String ricercaPerLavoro(@Valid @ModelAttribute Lavoro lavoro ,BindingResult bindingResult ,Model model){
		if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "GestioneCorsisti";
        }
		List<AnagraficaCandidato> listaAnagrafica = gestione.selectCorsistiSettoreLavorativo(lavoro.getAmbito());
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca per formazione
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti4.action")
	public String ricercaPerFormazione(BindingResult bindingResult ,Model model){
		// TODO
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca per corso
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti5.action")
	public String ricercaPerCorso(@Valid @ModelAttribute Corso corso , BindingResult bindingResult ,Model model){
		if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "GestioneCorsisti";
        }
		//TODO
		return "GestioneCorsisti";
	}
}

