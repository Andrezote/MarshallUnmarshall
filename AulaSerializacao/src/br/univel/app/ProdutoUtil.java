package br.univel.app;

import java.util.ArrayList;
import java.util.List;

import br.univel.xml.Produto;

public class ProdutoUtil {
	
	public static List<Produto> newListProduto(){
		List<Produto> lista = new ArrayList<>(1000);
		
		for(int i = 1; i<= 1000; i++){
			Produto p = new Produto();
			p.setId(i);
			p.setNome("Produto " + i);
			lista.add(p);
		}
		
		return lista;
	}
}
