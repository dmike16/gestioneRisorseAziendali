package domain.selezione;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class Esito {
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idEsito;
	@NotNull
	private String valutazione;
	private String descrizione;
	
	public int getIdEsito() {
		return idEsito;
	}
	public void setIdEsito(int idEsito) {
		this.idEsito = idEsito;
	}
	public String getValutazione() {
		return valutazione;
	}
	public void setValutazione(String valutazione) {
		this.valutazione = valutazione;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	

}
