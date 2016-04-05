
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DBGestioneCorsisti;
import domain.RicercaScelta;
import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.Azienda;
import domain.anagrafica.Certificazione;
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

	private DBGestioneCorsisti db = new DBGestioneCorsisti();
	
	/**
	 * Metodo che rimanda la jsp che contiente tutte le form
	 * per la gestione dei corsisti
	 * 
	 * @return String index jsp
	 */
	@RequestMapping(value="gestioneCorsisti.action")
	public String gestioneCorsisti(Model model)
	{
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
			try
			{
				ArrayList<Formazione> listFormazione = db.selectFormazioneCorsisti(ricercaScelta);
				model.addAttribute("formazione", listFormazione);
			}
			catch(SQLException e)
			{}
		}
		else if(scelta.equals("lavoro")){
			List<Lavoro> listaLavori;
			try {
				listaLavori = db.selectLavoriCorsisti(ricercaScelta);
				List<Azienda> listaAziende = db.selectAziendeCorsisti(ricercaScelta);
				model.addAttribute("lavori",listaLavori);
				model.addAttribute("aziende",listaAziende);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		else if (scelta.equals("certificazioni")){
			List<Certificazione> certificazioni;
			try {
				certificazioni = db.selectCompetenzeInformaticheCorsisti(ricercaScelta);
				model.addAttribute("certificazioni" , certificazioni);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		else if(scelta.equals("corsi")){
			List<Corso> listaCorsi;
			try {
				listaCorsi = db.selectCorsiCorsisti(ricercaScelta);
				model.addAttribute ("corsi",listaCorsi);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
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
		List<AnagraficaCandidato> listaAnagraficaCandidato = new ArrayList<AnagraficaCandidato>();
		List<Formazione> listaFormazione = new ArrayList<Formazione>();
		try {
			listaFormazione = db.selectCorsistiPerVotoStudio(anagraficaCandidato.getTitoloStudio());
			listaAnagraficaCandidato = db.selectCorsistiPerStudio(anagraficaCandidato.getTitoloStudio());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		List<AnagraficaCandidato> listaAnagrafica = new ArrayList<AnagraficaCandidato>();
		try {
			listaAnagrafica = db.selectCorsistiSettoreLavorativo(lavoro.getAmbito());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("anagrafica",listaAnagrafica);
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca per formazione
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti4.action")
	public String ricercaPerFormazione(@Valid @ModelAttribute Certificazione certificazione,BindingResult bindingResult ,Model model){
		if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "GestioneCorsisti";
        }
		List<AnagraficaCandidato> listaAnagrafica = new ArrayList<AnagraficaCandidato>();
		List<Certificazione> listaCertificazione = new ArrayList<Certificazione>();
		try {
			listaAnagrafica = db.selectCorsistiCertificazioniDaCompetenze(certificazione.getSettore());
			listaCertificazione = db.selectCertificazioniDaCompetenze(certificazione.getSettore());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("anagrafica",listaAnagrafica);
		model.addAttribute("certificazione" , listaCertificazione);
		return "GestioneCorsisti";
	}
	
	/**
	 * Metodo che interroga il database per la ricerca per corso
	 * 
	 * @return String GestioneCorsisti
	 */
	@RequestMapping("GestioneCorsisti5.action")
	public String ricercaPerCorso(@Valid @ModelAttribute Certificazione certificazione , BindingResult bindingResult ,Model model){
		if (bindingResult.hasErrors()) {
            FieldError fieldError = bindingResult.getFieldError();
            return "GestioneCorsisti";
        }
		List<AnagraficaCandidato> listaAnagrafica = new ArrayList<AnagraficaCandidato>();
		List<Certificazione> listaCertificazione= new ArrayList<Certificazione>();
		try {
			listaAnagrafica = db.selectCorsistiDaCertificazioni(certificazione);
			listaCertificazione = db.selectCertificazioniDaCertificazione(certificazione);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("anagrafica",listaAnagrafica);
		model.addAttribute("specializzazione",listaCertificazione);
		return "GestioneCorsisti";
	}
}


