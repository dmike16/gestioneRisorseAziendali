package domain.anagrafica;

import javax.validation.constraints.NotNull;

public class Lavoro {
	@NotNull
	private int idLavoro;
	@NotNull
	private String ambito;
	@NotNull
	private String impiego;
	@NotNull
	private int idLuogoData;
	@NotNull
	private int stipendio;
	
	public int getIdLavoro() {
		return idLavoro;
	}
	public void setIdLavoro(int idLavoro) {
		this.idLavoro = idLavoro;
	}
	public String getAmbito() {
		return ambito;
	}
	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}
	public String getImpiego() {
		return impiego;
	}
	public void setImpiego(String impiego) {
		this.impiego = impiego;
	}
	public int getIdLuogoData() {
		return idLuogoData;
	}
	public void setIdLuogoData(int idLuogoData) {
		this.idLuogoData = idLuogoData;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	
}
