package controller;




import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbGestioneAnagraficaRisorse;
import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.FormDatiAnagrafici;
import domain.anagrafica.Indirizzo;

@Controller
public class ControllerDatiAnagrafici {
	
	@RequestMapping(value="/gestioneCV.action")
	public String gestioneCV(Model model)
	{
		return "GestioneCV";
	}
	
	@RequestMapping(value="/index.action")
	public String index(Model model)
	{
		return "Index";
	}

  	@RequestMapping(value="/gestioneDatiAnagrafici.action")//Verificato
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
	public String inserimentoCandidato(BindingResult bindingResult,Model model, @ModelAttribute("form") FormDatiAnagrafici form) {
		
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
}
