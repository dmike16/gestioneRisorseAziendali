package test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import domain.corso.Ricerca;

@Controller
public class TestSpring {
	
	
	@RequestMapping("indexRicerca.action")
	public String index(){
		return "RicercaDatiAnagrafici";
	}
	@RequestMapping("ricercaDatiAnagrafici1.action")
	public String testFormSpring(Ricerca sch, Model model){
		
		if(sch.getNome().isEmpty() && sch.getCognome().isEmpty()){
			model.addAttribute("nomeCognomeError","Entrambi i campi nulli");
		}
		
		model.addAttribute("ricerca", sch);
		
		return "RicercaDatiAnagrafici";
	}
	
	@RequestMapping("ricercaDatiAnagrafici2.action")
	public String testFromSpring(@RequestParam("email") String email, Model model){
		
		
		if(email.isEmpty()){
			model.addAttribute("emailError", "email Vuota");
		}
		model.addAttribute("email", email);
		
		return "RicercaDatiAnagrafici";
	}
}
