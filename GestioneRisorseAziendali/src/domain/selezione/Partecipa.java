package domain.selezione;

import javax.validation.constraints.*;

public class Partecipa {
	
	@NotNull
	private int idCandidato;
	@Digits(integer=6,fraction=0)
	private  int idSelezione;


	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	public int getIdSelezione() {
		return idSelezione;
	}
	public void setIdSelezione(int idSelezione) {
		this.idSelezione = idSelezione;
	}

}
