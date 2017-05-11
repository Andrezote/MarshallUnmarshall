package br.univel;

import java.io.Serializable;

public class Aluno implements Serializable {

	//na hora de serializar e deserializar saber se e a mesma versao que esta sendo utilizada
	private static final long serialVersionUID = -6784607087400745541L;
	
	private int ra;
	private String nomeCompleto;
	private String telefone;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
