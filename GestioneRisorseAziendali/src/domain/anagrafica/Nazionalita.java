package domain.anagrafica;
import javax.validation.constraints.*;
public class Nazionalita {
	
	private int idNazionalita;
	private String nomeNazionalita;
	public Nazionalita() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdNazionalita() {
		return idNazionalita;
	}
	public void setIdNazionalita(int idNazionalita) {
		this.idNazionalita = idNazionalita;
	}
	
	
	public String getNomeNazionalita() {
		return nomeNazionalita;
	}
	public void setNomeNazionalita(String nomeNazionalita) {
		this.nomeNazionalita = nomeNazionalita;
	}
	

}
