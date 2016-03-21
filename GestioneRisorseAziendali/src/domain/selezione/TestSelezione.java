package domain.selezione;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class TestSelezione {
	
	@NotNull
	private String idTest;
	
	@NotNull
	@Size(min=7, max=7)
	private String codiceBatteria;
	
	
	private int punteggio;
	
	@NotNull
	private int idSelezione;
	
	public String getIdTest() {
		return idTest;
	}
	
	public void setIdTest(String idTest) {
		this.idTest = idTest;
	}
	
	public String getCodiceBatteria() {
		return codiceBatteria;
	}
	
	public void setCodiceBatteria(String codiceBatteria) {
		this.codiceBatteria = codiceBatteria;
	}
	
	public int getPunteggio() {
		return punteggio;
	}
	
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	public int getIdSelezione() {
		return idSelezione;
	}
	
	public void setIdSelezione(int idSelezione) {
		this.idSelezione = idSelezione;
	}
	
	
	

}
