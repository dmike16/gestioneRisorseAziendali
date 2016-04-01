package domain.corso;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Modulo {
	@Size(min=6,max=7)
	private String idModulo;
	
	@NotNull
	private String nomeModulo;
	
	
	public String getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(String idModulo) {
		this.idModulo = idModulo;
	}
	public String getNomeModulo() {
		return nomeModulo;
	}
	public void setNomeModulo(String nomeModulo) {
		this.nomeModulo = nomeModulo;
	}
	
	
	
	
}
