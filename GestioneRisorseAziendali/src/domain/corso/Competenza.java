package domain.corso;

import javax.validation.constraints.NotNull;

public class Competenza {
	
	@NotNull
	private int idCompetenza;
	
	
	private String settore;
	private String specializzazione;
	
	
	public int getIdCompetenza() {
		return idCompetenza;
	}
	public void setIdCompetenza(int idCompetenza) {
		this.idCompetenza = idCompetenza;
	}
	public String getSettore() {
		return settore;
	}
	public void setSettore(String settore) {
		this.settore = settore;
	}
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}
	
	

}
