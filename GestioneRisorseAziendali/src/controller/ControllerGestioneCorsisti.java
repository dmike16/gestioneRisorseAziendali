package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerGestioneCorsisti {
	
	@RequestMapping("gestioneCorsisti.action")
	public String gestioneCorsistiIndex(){
		return "GestioneCorsisti";
	}
	
	@RequestMapping("GestioneCorsisti1.action")
	public String ricercaPerNome(){
		return "GestioneCorsisti";
	}
	
	@RequestMapping("GestioneCorsiti2.action")
	public String ricercaPerTitolo(){
		return "GestioneCorsisti";
	}
	
	@RequestMapping("GestioneCorsisti3.action")
	public String ricercaPerLavoro(){
		return "GestioneCorsisti";
	}
	
	@RequestMapping("GestioneCorsisti4.action")
	public String ricercaPerFormazione(){
		return "GestioneCorsisti";
	}
	
	@RequestMapping("GestioneCorsisti5.action")
	public String ricercaPerCorso(){
		return "GestioneCorsisti";
	}
}
