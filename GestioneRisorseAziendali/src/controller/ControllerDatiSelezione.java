package controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import service.ConnessioneService;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerDatiSelezione {
	@Autowired  // mi autoistanzia  L'interfaccia ProductService senza che ogni volta la devo dichiarare
	private ConnessioneService connessioneService;

	@RequestMapping(value = "/GestioneDatiSelezione1.action")
	public String gestioneDatiSelezione1(
			@RequestParam(value ="nome",required = true) String nome,
			@RequestParam(value ="cognome",required = true) String cognome,
			@RequestParam(value ="ricerca",required = true) String ricerca,
			BindingResult bindingResult ,Model model){

		if(ricerca.equals("potenzialita")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =connessioneService.selectNomeCognomePotenzialita(nome, cognome);
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}
		else if(ricerca.equals("profiloCaratteriale")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =connessioneService.selectNomeCognomeProfiloCaratteriale(nome, cognome);
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}



		//model.addAttributes(arg0)
		return "GestioneDatiSelezione";
	}


	@RequestMapping(value = "/GestioneDatiSelezione2.action")
	public String gestioneDatiSelezione2(BindingResult bindingResult ,Model model){
		//model.addAttributes(arg0)
		return "GestioneDatiSelezione";
	}

	
}
