package controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import db.DbGestioneSelezione;
import db.ConnessioneDb;

@Controller
public class ControllerDatiSelezione {

	DbGestioneSelezione db = new DbGestioneSelezione();
	
	
	@RequestMapping(value = "/gestioneSelezione.action")
	public String gestioneSelezione(Model model){
		return "GestioneDatiSelezione";
	}
			
	@RequestMapping(value = "/GestioneDatiSelezione1.action")
	public String gestioneDatiSelezione1(
			@RequestParam(value ="nome",required = true) String nome,
			@RequestParam(value ="cognome",required = true) String cognome,
			@RequestParam(value ="ricerca",required = true) String ricerca,
			BindingResult bindingResult ,Model model){

		if(ricerca.equals("potenzialita")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list=db.selectNomeCognomePotenzialita(nome, cognome);
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
				list =db.selectNomeCognomeProfiloCaratteriale(nome, cognome);
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}
		
		else if(ricerca.equals("valutazioniOsservazioniColloquio")){
			try{
				ArrayList<String> list = new ArrayList<>();
			//	list =db.selectNomeCognomeProfiloCaratteriale(nome, cognome);
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}
		
		else if(ricerca.equals("batterieTest")){
			try{
				ArrayList<String> list = new ArrayList<>();
			//	list =db.selectNomeCognomeProfiloCaratteriale(nome, cognome);
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}
		
		else if(ricerca.equals("moduli")){
			try{
				ArrayList<String> list = new ArrayList<>();
			//	list =db.selectNomeCognomeProfiloCaratteriale(nome, cognome);
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}
		
		else if(ricerca.equals("modulo")){
			try{
				ArrayList<String> list = new ArrayList<>();
			//	list =db.selectNomeCognomeProfiloCaratteriale(nome, cognome);
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
