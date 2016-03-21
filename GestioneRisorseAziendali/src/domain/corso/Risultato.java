package domain.corso;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Risultato {
	
	@NotNull @Size(min=6, max=7)
	private String idModulo;
	@NotNull @Digits(integer =6, fraction = 0)
	private int idRisorsa;
	
	private String valutazione;
	private String esito;
	
	
	public Risultato() {
		super();
	}


	public String getIdModulo() {
		return idModulo;
	}


	public void setIdModulo(String idModulo) {
		this.idModulo = idModulo;
	}


	public int getIdRisorsa() {
		return idRisorsa;
	}


	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}


	public String getValutazione() {
		return valutazione;
	}


	public void setValutazione(String valutazione) {
		this.valutazione = valutazione;
	}


	public String getEsito() {
		return esito;
	}


	public void setEsito(String esito) {
		this.esito = esito;
	}
	
	
	
	

}
