package br.univel.app;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import br.univel.xml.Produto;

@XmlRootElement
public class ProdutoWrapper {
	
	private List<Produto> lista;

	public List<Produto> getLista() {
		return lista;
	}

	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}
	

}
