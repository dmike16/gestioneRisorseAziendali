package controller;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbGestioneAnagraficaRisorse;
import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.CV;
import domain.anagrafica.Indirizzo;
import domain.anagrafica.formAnagrafica.FormDatiAnagrafici;

@Controller
public class ControllerDatiAnagrafici {
	
	

	
  	@RequestMapping(value="/gestioneDatiAnagrafici.action")
	public String gestioneDatiAnagrafici(Model model)
	{
		return "GestioneDatiAnagrafici";
	}
	
	@RequestMapping(value="/inserimentoDatiAnagrafici.action")
	public String inserimentoDatiAnagrafici(Model model)
	{
		model.addAttribute("form", new FormDatiAnagrafici());
		return "InserimentoDatiAnagrafici";
	}
	
	@RequestMapping(value="/inserimentoCandidato.action")
	public String inserimentoCandidato(Model model, @ModelAttribute("form") FormDatiAnagrafici form,
        BindingResult bindingResult) {
		
		AnagraficaCandidato anagCand = form.getAnagraficaCandidato();
		Indirizzo indirizzo = form.getIndirizzo();
		
		
		DbGestioneAnagraficaRisorse db = new DbGestioneAnagraficaRisorse();
		
		try {
			db.insertIndirizzo(indirizzo);
		
			db.insertAnagraficaCandidato(anagCand);
			
			if (bindingResult.hasErrors()) {
		        FieldError fieldError = bindingResult.getFieldError();		
				return "GestioneDatiAnagrafici";
		    	}	
		
			return "GestioneDatiAnagrafici";
	

	    
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return "GestioneDatiAnagrafici";

		}
		
	}
	
	@RequestMapping(value="/inserisciCV.action")
	public String inserisciCV(Model model)
	{
		return null;
	}
}
