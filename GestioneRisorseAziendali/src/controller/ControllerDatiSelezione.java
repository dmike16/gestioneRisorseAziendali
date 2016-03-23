package controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

public class ControllerDatiSelezione {
	@RequestMapping(value = "/GestioneDatiSelezione1.action")
	public String gestioneDatiSelezione1(BindingResult bindingResult ,Model model){
		//model.addAttributes(arg0)
		return "GestioneDatiSelezione";
	}


	@RequestMapping(value = "/GestioneDatiSelezione2.action")
	public String gestioneDatiSelezione2(BindingResult bindingResult ,Model model){
		//model.addAttributes(arg0)
		return "GestioneDatiSelezione";
	}
	
	@RequestMapping(value = "/GestioneDatiSelezione3.action")
	public String gestioneDatiSelezione3(BindingResult bindingResult ,Model model){
		//model.addAttributes(arg0)
		return "GestioneDatiSelezione";
	}
	@RequestMapping(value = "/GestioneDatiSelezione4.action")
	public String gestioneDatiSelezione4(BindingResult bindingResult ,Model model){
		//model.addAttributes(arg0)
		return "GestioneDatiSelezione";
	}
	@RequestMapping(value = "/GestioneDatiSelezione4.action")
	public String gestioneDatiSelezione5(BindingResult bindingResult ,Model model){
		//model.addAllAttributes(arg0)
		return "GestioneDatiSelezione";
	}
}