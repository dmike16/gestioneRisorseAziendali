package domain.anagrafica;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Indirizzo {

	@NotNull
	private int idIndirizzo;
	@NotNull
	private String citta;
	@NotNull
	@Size(min=5,max=5)
	private String cap;
	@NotNull
	private String via;
	private int nCivico;
	
	public int getIdIndirizzo() {
		return idIndirizzo;
	}
	public void setIdIndirizzo(int idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getnCivico() {
		return nCivico;
	}
	public void setnCivico(int nCivico) {
		this.nCivico = nCivico;
	}
	
	
}
