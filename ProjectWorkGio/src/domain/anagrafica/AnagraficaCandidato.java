package domain.anagrafica;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class AnagraficaCandidato {
	@NotNull
	@Digits(integer=6,fraction=0)
	private int idAnagraficaCandidato;
	
	@NotNull
	private int idIndirizzo;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String cognome;
	
	@NotNull
	@Past
	private LocalDate dataNascita;
	
	@NotNull
	@Size(min=10,max=10)
	private String cellulare;
	
	@NotNull
	private String email;
	
	@NotNull
	private String titoloStudio;
	public AnagraficaCandidato() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdAnagraficaCandidato() {
		return idAnagraficaCandidato;
	}
	public void setIdAnagraficaCandidato(int idAnagraficaCandidato) {
		this.idAnagraficaCandidato = idAnagraficaCandidato;
	}
	public int getIdIndirizzo() {
		return idIndirizzo;
	}
	public void setIdIndirizzo(int idIndirizzo) {
		this.idIndirizzo = idIndirizzo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
	public String getCellulare() {
		return cellulare;
	}
	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitoloStudio() {
		return titoloStudio;
	}
	public void setTitoloStudio(String titoloStudio) {
		this.titoloStudio = titoloStudio;
	}
	
	
	

}
