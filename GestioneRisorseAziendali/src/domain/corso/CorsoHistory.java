package domain.corso;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CorsoHistory {
	
	@Size (min=6, max=7)
	private int idCorso;
	
	@NotNull
	private int idRisorsa;
	
	
	public CorsoHistory() {
		super();
	}


	public int getIdCorso() {
		return idCorso;
	}


	public void setIdCorso(int idCorso) {
		this.idCorso = idCorso;
	}


	public int getIdRisorsa() {
		return idRisorsa;
	}


	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}
	
	
	
	

}
