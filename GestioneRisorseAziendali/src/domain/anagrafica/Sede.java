package domain.anagrafica;
import javax.validation.constraints.*;

public class Sede {
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idSede;
	private String tipoSede;

	@NotNull
	@Digits(integer=6,fraction=0)
	private int idIndirizzo;
	public Sede() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}
	public String getTipoSede() {
		return tipoSede;
	}
	public void setTipoSede(String tipoSede) {
		this.tipoSede = tipoSede;
	}
	public int getIdIndirizzo() {
		return idIndirizzo;
	}
	public void setIdIndirizzo(int idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}
	
	

}
