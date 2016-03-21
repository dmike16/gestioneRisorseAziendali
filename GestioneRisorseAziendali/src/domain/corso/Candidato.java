package domain.corso;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

public class Candidato {
	@NotNull
	@Digits(integer=6 , fraction=0)
	private int idCandidato;
	@NotNull
	private int idAnagrafica;
	private int idRisorsa;
	private int idCv;
	
	
	public int getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(int idCandidato) {
		this.idCandidato = idCandidato;
	}
	public int getIdAnagrafica() {
		return idAnagrafica;
	}
	public void setIdAnagrafica(int idAnagrafica) {
		this.idAnagrafica = idAnagrafica;
	}
	public int getIdRisorsa() {
		return idRisorsa;
	}
	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}
	public int getIdCv() {
		return idCv;
	}
	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}
	
}
