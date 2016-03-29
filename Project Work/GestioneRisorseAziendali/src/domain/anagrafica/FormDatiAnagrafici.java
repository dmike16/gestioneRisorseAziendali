package domain.anagrafica.formAnagrafica;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import domain.anagrafica.AnagraficaCandidato;
import domain.anagrafica.CV;
import domain.anagrafica.Indirizzo;

public class FormDatiAnagrafici {
	
	private AnagraficaCandidato anagraficaCandidato;
	private Indirizzo indirizzo;
	
	
	public AnagraficaCandidato getAnagraficaCandidato() {
		return anagraficaCandidato;
	}
	public void setAnagraficaCandidato(AnagraficaCandidato anagraficaCandidato) {
		this.anagraficaCandidato = anagraficaCandidato;
	}
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	
	

}
