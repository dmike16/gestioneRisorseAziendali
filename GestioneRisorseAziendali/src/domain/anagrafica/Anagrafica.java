package domain.anagrafica;
import javax.validation.constraints.*;

public class Anagrafica {
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idAnagrafica;
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idAnagraficaCandidato;
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idRisorsa
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idNazionalita;
	
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idIndirizzo;
	
	@NotNull
	private String luogoNascita;
	
	@NotNull
	private String telefono;
	
	@NotNull
	private String codiceFiscale;
	
	@NotNull
	private String sesso;
	
	
	public Anagrafica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAnagrafica() {
		return idAnagrafica;
	}
	public void setIdAnagrafica(int idAnagrafica) {
		this.idAnagrafica = idAnagrafica;
	}
	public int getIdAnagraficaCandidato() {
		return idAnagraficaCandidato;
	}
	public void setIdAnagraficaCandidato(int idAnagraficaCandidato) {
		this.idAnagraficaCandidato = idAnagraficaCandidato;
	}
	public int getIdRisorsa() {
		return idRisorsa;
	}
	public void setIdRisorsa(int idRisorsa) {
		this.idRisorsa = idRisorsa;
	}
	public int getIdIndirizzo() {
		return idIndirizzo;
	}
	public void setIdIndirizzo(int idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}
	public String getLuogoNascita() {
		return luogoNascita;
	}
	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public int getIdNazionalita() {
		return idNazionalita;
	}
	public void setIdNazionalita(int idNazionalita) {
		this.idNazionalita = idNazionalita;
	}
	public String getSesso() {
		return sesso;
	}
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	
	

}
