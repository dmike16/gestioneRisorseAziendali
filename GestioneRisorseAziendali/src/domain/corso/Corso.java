package domain.corso;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Corso {
	
	
	@Size(min=6, max=7)
	private String idCorso;
	
	@NotNull
	private String titoloCorso;
	
    private Date dataInizio;
	private Date dataFine;
	
	@NotNull
	private String azienda;
	private char superamento;
	
	@NotNull
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
	public Date getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	public Date getDataFine() {
		return dataFine;
	}
	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
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
