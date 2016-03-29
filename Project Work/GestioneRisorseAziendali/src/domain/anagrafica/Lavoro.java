package domain.anagrafica;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Lavoro {
	@NotNull
	private int idLavoro;
	@NotNull
	private String ambito;
	@NotNull
	private String impiego;
	
	private double stipendio;
	
	private LocalDate dataInizio;
	private LocalDate dataFine;
	private int idCv;
	private int idAzienda;
	
	
	
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
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
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
	
}
