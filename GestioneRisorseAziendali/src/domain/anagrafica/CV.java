package domain.anagrafica;

import javax.validation.constraints.NotNull;

public class CV {
	@NotNull
	private int idCV;
	
	private int idFormazione;
	private int idLavoro;
	private String urlImage;
	private int idLingua;
	
	public int getIdCV() {
		return idCV;
	}
	public void setIdCV(int idCV) {
		this.idCV = idCV;
	}
	public int getIdFormazione() {
		return idFormazione;
	}
	public void setIdFormazione(int idFormazione) {
		this.idFormazione = idFormazione;
	}
	public int getIdLavoro() {
		return idLavoro;
	}
	public void setIdLavoro(int idLavoro) {
		this.idLavoro = idLavoro;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public int getIdLingua() {
		return idLingua;
	}
	public void setIdLingua(int idLingua) {
		this.idLingua = idLingua;
	}


}
