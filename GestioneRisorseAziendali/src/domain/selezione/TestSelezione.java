package domain.selezione;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class TestSelezione {
	
	@NotNull
	@Size(min=6, max=7)
	private String idTest;
	
	private int codiceBatteria;
	
	private int punteggio;
	
	@Digits(integer=6, fraction=0)
	private int idSelezione;
	
	public String getIdTest() {
		return idTest;
	}
	
	public void setIdTest(String idTest) {
		this.idTest = idTest;
	}
	
	public int getCodiceBatteria() {
		return codiceBatteria;
	}
	
	public void setCodiceBatteria(int codiceBatteria) {
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
