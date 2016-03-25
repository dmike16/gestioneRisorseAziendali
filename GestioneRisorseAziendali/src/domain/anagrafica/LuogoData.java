package domain.anagrafica;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class LuogoData {
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idLuogoData;
	
	private LocalDate dataInizio;
	private LocalDate dataFine;
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idAzienda;
	public LuogoData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdLuogoData() {
		return idLuogoData;
	}
	public void setIdLuogoData(int idLuogoData) {
		this.idLuogoData = idLuogoData;
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
	public int getIdAzienda() {
		return idAzienda;
	}
	public void setIdAzienda(int idAzienda) {
		this.idAzienda = idAzienda;
	}
	
	
	

}
