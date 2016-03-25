package domain.selezione;

import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Digits;

public class Selezione {
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idSelezione;
	
	private LocalDate dataSelezione;
	private int esito;
	public Selezione() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdSelezione() {
		return idSelezione;
	}
	public void setIdSelezione(int idSelezione) {
		this.idSelezione = idSelezione;
	}
	public LocalDate getDataSelezione() {
		return dataSelezione;
	}
	public void setDataSelezione(LocalDate dataSelezione) {
		this.dataSelezione = dataSelezione;
	}
	public int getEsito() {
		return esito;
	}
	public void setEsito(int esito) {
		this.esito = esito;
	}
}
