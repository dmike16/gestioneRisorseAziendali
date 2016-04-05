package controller;




import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbGestioneAnagraficaRisorse;
import domain.RicercaScelta;
import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.FormDatiAnagrafici;
import domain.anagrafica.Indirizzo;

@Controller
public class ControllerDatiAnagrafici {
	private static final Log logger = LogFactory.getLog(ControllerDatiAnagrafici.class);
	
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
	public String inserimentoCandidato( @Valid @ModelAttribute("form") FormDatiAnagrafici form,
			BindingResult bindingResult,Model model) {
		
		
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			logger.info("Code:" + fieldError.getCode() + ", object:"
                    + fieldError.getObjectName() + ", field:"
                    + fieldError.getField());
			return "InserimentoDatiAnagrafici";
		}
		AnagraficaCandidato anagCand = form.getAnagraficaCandidato();
		Indirizzo indirizzo = form.getIndirizzo();
		
		System.out.println(anagCand.toString());
		System.out.println(indirizzo.toString());
		DbGestioneAnagraficaRisorse db = new DbGestioneAnagraficaRisorse();
		try {
			db.insertIndirizzo(indirizzo);
		
			db.insertAnagraficaCandidato(anagCand);
		
			return "GestioneDatiAnagrafici";
	

	    
		} catch (SQLException e) {
		
		e.printStackTrace();
		return "GestioneDatiAnagrafici";

		}
	}
	
	@RequestMapping(value="/ricercaDatiAnagrafici.action")
	public String ricercaCandidato(Model model){
		
		model.addAttribute("ricerca",new RicercaScelta());
		
		return "RicercaDatiAnagrafici";
	}
	
	@RequestMapping(value="/ricercaDatiAnagrafici1.action")
	public String ricercaPerNome(@ModelAttribute("ricerca") RicercaScelta ricercaScelta, BindingResult bindingResult,Model model ){
		if(bindingResult.hasErrors()){
			FieldError fieldError = bindingResult.getFieldError();
			logger.info("Code:" + fieldError.getCode() + ", object:"
                    + fieldError.getObjectName() + ", field:"
                    + fieldError.getField());
			return "RicercaDatiAnagrafici";
		}
		System.out.println(ricercaScelta.getNome());
		List<AnagraficaCandidato>listaCandidato = new ArrayList<>();
		
		DbGestioneAnagraficaRisorse db = new DbGestioneAnagraficaRisorse();
		try{
			System.out.println(ricercaScelta.getNome());
			listaCandidato = db.selectCandidato(ricercaScelta.getNome(), ricercaScelta.getCognome());
			model.addAttribute("listaCandidato", listaCandidato);
			System.out.println(listaCandidato.toString());
			return "RicercaDatiAnagrafici";
		
		}catch(SQLException e){
			
		}
		return "RicercaDatiAnagrafici";
	}
	
}
