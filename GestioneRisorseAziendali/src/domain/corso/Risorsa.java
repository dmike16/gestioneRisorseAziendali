package domain.corso;

import javax.validation.constraints.NotNull;

public class Risorsa {
	@NotNull
	private int idRisorsa;
	
	private int idAnagrafica;
	private int idTirocinio;
	
	public int getIdRisorsa() {
		return idRisorsa;
	}
	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}
	public int getIdTirocinio() {
		return idTirocinio;
	}
	public void setIdTirocinio(int idTirocinio) {
		this.idTirocinio = idTirocinio;
	}
	public int getIdAnagrafica() {
		return idAnagrafica;
	}
	public void setIdAnagrafica(int idAnagrafica) {
		this.idAnagrafica = idAnagrafica;
	}
	
	
}
