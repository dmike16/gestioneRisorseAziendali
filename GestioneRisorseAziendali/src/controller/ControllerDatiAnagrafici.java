package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "InserimentoCandidato";
	}
	
	@RequestMapping(value="/inserimentoCandidato.action")
	public String inserimentoCandidato(Model model)
	{
		
		return "GestioneDatiAnagrafici";
	}
	
	@RequestMapping(value="/inserisciCV.action")
	public String inserisciCV(Model model)
	{
		return null;
	}
}
