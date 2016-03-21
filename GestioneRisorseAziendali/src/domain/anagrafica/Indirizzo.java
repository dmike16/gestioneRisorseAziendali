package domain.anagrafica;
import javax.validation.constraints.*;

public class Indirizzo {
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idIndirizzo;
	
	@NotNull
	private String citta;
	
	@NotNull
	@Size(min=5,max=5)
	private String cap;
	
	@NotNull
	private String via;
	private String nCivico;
	public Indirizzo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdIndirizzo() {
		return idIndirizzo;
	}
	public void setIdIndirizzo(int idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getnCivico() {
		return nCivico;
	}
	public void setnCivico(String nCivico) {
		this.nCivico = nCivico;
	}
	

}
