package domain.anagrafica;

import javax.validation.constraints.NotNull;

public class Azienda {
	@NotNull
	private int idAzienda;
	@NotNull
	private String nome;
	
	private String tipoAzienda;
	@NotNull
	private String settore;
	@NotNull
	private int idSede;
	
	
	public int getIdAzienda() {
		return idAzienda;
	}
	public void setIdAzienda(int idAzienda) {
		this.idAzienda = idAzienda;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoAzienda() {
		return tipoAzienda;
	}
	public void setTipoAzienda(String tipoAzienda) {
		this.tipoAzienda = tipoAzienda;
	}
	public String getSettore() {
		return settore;
	}
	public void setSettore(String settore) {
		this.settore = settore;
	}
	public int getIdSede() {
		return idSede;
	}
	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}
	
}
