package domain.corso;

import java.sql.Date;
import java.time.LocalDate;

public class Corso {
	
	private String idCorso;
	private String titoloCorso;
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private String azienda;
	private char superamento;
	private int idCompetenza;
	
	
	public String getIdCorso() {
		return idCorso;
	}
	public void setIdCorso(String idCorso) {
		this.idCorso = idCorso;
	}
	public String getTitoloCorso() {
		return titoloCorso;
	}
	public void setTitoloCorso(String titoloCorso) {
		this.titoloCorso = titoloCorso;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate localDate) {
		this.dataInizio = localDate;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public void setDataFine(LocalDate localDate) {
		this.dataFine = localDate;
	}
	public String getAzienda() {
		return azienda;
	}
	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}
	public char getSuperamento() {
		return superamento;
	}
	public void setSuperamento(char superamento) {
		this.superamento = superamento;
	}
	public int getIdCompetenza() {
		return idCompetenza;
	}
	public void setIdCompetenza(int idCompetenza) {
		this.idCompetenza = idCompetenza;
	}
	
	
	

}
