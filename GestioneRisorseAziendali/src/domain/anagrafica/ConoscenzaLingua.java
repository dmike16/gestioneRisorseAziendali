package domain.anagrafica;

import javax.validation.constraints.NotNull;

public class ConoscenzaLingua {
	@NotNull
	private int idConoscenzaLingua;
	
	private String scritta;
	private String parlata;
	private String comprensione;
	public int getIdConoscenzaLingua() {
		return idConoscenzaLingua;
	}
	public void setIdConoscenzaLingua(int idConoscenzaLingua) {
		this.idConoscenzaLingua = idConoscenzaLingua;
	}
	public String getScritta() {
		return scritta;
	}
	public void setScritta(String scritta) {
		this.scritta = scritta;
	}
	public String getParlata() {
		return parlata;
	}
	public void setParlata(String parlata) {
		this.parlata = parlata;
	}
	public String getComprensione() {
		return comprensione;
	}
	public void setComprensione(String comprensione) {
		this.comprensione = comprensione;
	}
	
	
}
