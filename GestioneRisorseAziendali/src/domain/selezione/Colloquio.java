package domain.selezione;
import javax.validation.constraints.NotNull;

public class Colloquio {
	@NotNull
	private int idColloquio;
	
	private float valutazioneFinale;
	private String osservazioni;
	private String tipologia;
	
	@NotNull
	private int idSelezione;
	
	private String potenzialita;
	private String profiloCaretteriale;
	public int getIdColloquio() {
		return idColloquio;
	}
	public void setIdColloquio(int idColloquio) {
		this.idColloquio = idColloquio;
	}
	public float getValutazioneFinale() {
		return valutazioneFinale;
	}
	public void setValutazioneFinale(float valutazioneFinale) {
		this.valutazioneFinale = valutazioneFinale;
	}
	public String getOsservazioni() {
		return osservazioni;
	}
	public void setOsservazioni(String osservazioni) {
		this.osservazioni = osservazioni;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public int getIdSelezione() {
		return idSelezione;
	}
	public void setIdSelezione(int idSelezione) {
		this.idSelezione = idSelezione;
	}
	public String getPotenzialita() {
		return potenzialita;
	}
	public void setPotenzialita(String potenzialita) {
		this.potenzialita = potenzialita;
	}
	public String getProfiloCaretteriale() {
		return profiloCaretteriale;
	}
	public void setProfiloCaretteriale(String profiloCaretteriale) {
		this.profiloCaretteriale = profiloCaretteriale;
	}
	
	
}
