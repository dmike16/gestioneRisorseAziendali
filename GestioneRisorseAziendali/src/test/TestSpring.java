package test;

import java.util.Map;

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
	public String testFormSpring(@RequestParam Map<String,String> ricerca, Model model){
		
		if(ricerca.get("nome").isEmpty() && ricerca.get("cognome").isEmpty()){
			model.addAttribute("nomeCognomeError","Entrambi i campi nulli");
		}
		
		model.addAllAttributes(ricerca);
		
		return "RicercaDatiAnagrafici";
	}
	
	@RequestMapping("ricercaDatiAnagrafici2.action")
	public String testFromSpring(@RequestParam("email") String email, Model model){
		
		
		if(email.isEmpty()){
			model.addAttribute("emailError", "Email vuota");
		}
		model.addAttribute("email", email);
		
		return "RicercaDatiAnagrafici";
	}
}
