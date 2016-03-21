package domain.anagrafica;
import javax.validation.constraints.*;

public class Lingua {
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idLingua;
	
	@NotNull
	private String lingua;
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idConoscenzaLingua;
	
	public Lingua() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdLingua() {
		return idLingua;
	}
	public void setIdLingua(int idLingua) {
		this.idLingua = idLingua;
	}
	public String getLingua() {
		return lingua;
	}
	public void setLingua(String lingua) {
		this.lingua = lingua;
	}
	public int getIdConoscenzaLingua() {
		return idConoscenzaLingua;
	}
	public void setIdConoscenzaLingua(int idConoscenzaLingua) {
		this.idConoscenzaLingua = idConoscenzaLingua;
	}
	

}
