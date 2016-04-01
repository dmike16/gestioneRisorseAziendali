package domain.selezione;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Batteria {
	
	@NotNull
	@Size(min=6,max=7)
	private String codiceBatteria;
	@NotNull
	private String tipo;
	@NotNull
	private int punteggioBatteria;
	
	private String idTest;

	public Batteria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCodiceBatteria() {
		return codiceBatteria;
	}

	public void setCodiceBatteria(String codiceBatteria) {
		this.codiceBatteria = codiceBatteria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPunteggioBatteria() {
		return punteggioBatteria;
	}

	public void setPunteggioBatteria(int punteggioBatteria) {
		this.punteggioBatteria = punteggioBatteria;
	}

	public String getIdTest() {
		return idTest;
	}

	public void setIdTest(String idTest) {
		this.idTest = idTest;
	}
}
