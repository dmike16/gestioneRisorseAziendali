package domain.anagrafica;

public class Formazione {
	
	private int idFormazione;
	private String titoloStudio;
	private String descrizione;
	private String votazione;
	private int idLuogoData;
	
	
	public int getIdFormazione() {
		return idFormazione;
	}
	public void setIdFormazione(int idFormazione) {
		this.idFormazione = idFormazione;
	}
	public String getTitoloStudio() {
		return titoloStudio;
	}
	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getVotazione() {
		return votazione;
	}
	public void setVotazione(String votazione) {
		this.votazione = votazione;
	}
	public int getIdLuogoData() {
		return idLuogoData;
	}
	public void setIdLuogoData(int idLuogoData) {
		this.idLuogoData = idLuogoData;
	}
	
	
}
