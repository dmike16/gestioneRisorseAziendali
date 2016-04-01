package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.metadata.Db2CallMetaDataProvider;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbGestioneSelezione;
import domain.RicercaScelta;

@Controller
public class ControllerGestioneDatiSelezione {
	
	@RequestMapping(value="/gestioneSelezione.action")
	public String gestioneSelezione(Model model){
		model.addAttribute("ricerca",new RicercaScelta());
		
		return "GestioneDatiSelezione";
	}
	
	@RequestMapping(value = "/gestioneDatiSelezione.action")
	public String gestioneDatiSelezionPrimaRadio
		(@ModelAttribute("ricerca") RicercaScelta ricercaScelta,
				BindingResult bindingResult,Model model){
		
		if(bindingResult.hasErrors()){
			 FieldError fieldError = bindingResult.getFieldError();
			return "GestioneDatiSelezione";
		}
		System.out.println(ricercaScelta.getScelta());
		
		DbGestioneSelezione db = new DbGestioneSelezione();
		if(ricercaScelta.getScelta().equals("potenzialita")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list=db.selectNomeCognomePotenzialita(ricercaScelta.getNome(), ricercaScelta.getCognome());
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}

		else if(ricercaScelta.getScelta().equals("profiloCaratteriale")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =db.selectNomeCognomeProfiloCaratteriale(ricercaScelta.getNome(), ricercaScelta.getCognome());
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}

		else if(ricercaScelta.getScelta().equals("valutazioniOsservazioniColloquio")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =db.selectNomeCognomeProfiloCaratteriale(ricercaScelta.getNome(), ricercaScelta.getCognome());
				System.out.println(list.toString());
				model.addAttribute("list",list);
				System.out.println("ciao");
				return"VisualizzaDatiSelezione";
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}

		else if(ricercaScelta.getScelta().equals("batterieTest")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =db.selectNomeCognomeProfiloCaratteriale(ricercaScelta.getNome(), ricercaScelta.getCognome());
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}

		else if(ricercaScelta.getScelta().equals("moduli")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =db.selectNomeCognomeProfiloCaratteriale(ricercaScelta.getNome(), ricercaScelta.getCognome());
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}

		else if(ricercaScelta.getScelta().equals("modulo")){
			try{
				ArrayList<String> list = new ArrayList<>();
				list =db.selectNomeCognomeProfiloCaratteriale(ricercaScelta.getNome(), ricercaScelta.getCognome());
				model.addAttribute("list",list);
			}
			catch(Exception e ){
				System.out.println("e' entrato nel catch ");
				e.printStackTrace();
				return "GestioneDatiSelezione";
			}}



		
		return "GestioneDatiSelezione";
	}

	}

