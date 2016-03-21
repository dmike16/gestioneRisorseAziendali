package domain.corso;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CorsoHistory {
	
	@Size(min = 6, max=7)
	private String idCorso;
	
	@NotNull
	private int idRisorsa;
	
	
	public CorsoHistory() {
		super();
	}


	public String getIdCorso() {
		return idCorso;
	}


	public void setIdCorso(String idCorso) {
		this.idCorso = idCorso;
	}


	public int getIdRisorsa() {
		return idRisorsa;
	}


	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}
	
	
	
	

}
