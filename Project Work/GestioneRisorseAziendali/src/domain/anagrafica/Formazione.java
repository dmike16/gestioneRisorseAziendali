package domain.anagrafica;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Formazione {
	@NotNull
	private int idFormazione;
	@NotNull
	private String titoloStudio;
	@NotNull
	private String descrizione;
	@NotNull
	private String votazione;
	
	private LocalDate dataInizio;
	
	private LocalDate dataFine;
	
	private int idCv;
	
	private int idAzienda;
	
	/*@NotNull
	private int idLuogoData;*/


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
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	public int getIdCv() {
		return idCv;
	}
	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}
	public int getIdAzienda() {
		return idAzienda;
	}
	public void setIdAzienda(int idAzienda) {
		this.idAzienda = idAzienda;
	}
	
	
	/*public int getIdLuogoData() {
		return idLuogoData;
	}
	public void setIdLuogoData(int idLuogoData) {
		this.idLuogoData = idLuogoData;
	}*/


}
