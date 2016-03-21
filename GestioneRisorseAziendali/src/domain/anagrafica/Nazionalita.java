package domain.anagrafica;
import javax.validation.constraints.*;
public class Nazionalita {
	
	private int idNazionalita;
	private String siglaNazione;
	private String nomeNazione;
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
	public String getSiglaNazione() {
		return siglaNazione;
	}
	public void setSiglaNazione(String siglaNazione) {
		this.siglaNazione = siglaNazione;
	}
	public String getNomeNazione() {
		return nomeNazione;
	}
	public void setNomeNazione(String nomeNazione) {
		this.nomeNazione = nomeNazione;
	}
	

}
