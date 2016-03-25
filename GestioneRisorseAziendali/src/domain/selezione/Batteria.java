package domain.selezione;
import javax.validation.constraints.NotNull;

public class Batteria {
	
	@NotNull
	private int codiceBatteria;
	
	private String tipo;
	
	public int getCodiceBatteria() {
		return codiceBatteria;
	}
	public void setCodiceBatteria(int codiceBatteria) {
		this.codiceBatteria = codiceBatteria;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
