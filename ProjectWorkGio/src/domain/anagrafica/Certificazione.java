package domain.anagrafica;

public class Certificazione {
	private int idCertificazione;
	private String settore;
	private String specializzazione;
	private int idCv;
	public int getIdCertificazione() {
		return idCertificazione;
	}
	public void setIdCertificazione(int idCertificazione) {
		this.idCertificazione = idCertificazione;
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
	public int getIdCv() {
		return idCv;
	}
	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}
	
}
