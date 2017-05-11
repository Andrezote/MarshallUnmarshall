package br.univel.app;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.univel.xml.Produto;

public class MeuTableModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3440178778468281178L;
	
	private List<Produto> listaProdutos;

	public MeuTableModel(List<Produto> lista) {
		if(lista == null){
			this.listaProdutos = new ArrayList<>();
		}else{
			this.listaProdutos = lista;
		}
		
		//um sistema e um conjunto de partes inter relacionadas 
		//que trabalham para um objetivo comum
		
	}
	
	@Override
	public int getRowCount() {
		return listaProdutos.size();
	}
	
	@Override
	public int getColumnCount() {
		return 2;
	}
	
	@Override
	public String getColumnName(int column) {
		if(column == 0){
			return "Id";
		}
		
		if(column == 1){
			return "nome";
		}
		return super.getColumnName(column);
	}

	

	@Override
	public Object getValueAt(int row, int column) {
		Produto prod = listaProdutos.get(row);
		switch (column) {
		case 0:
			return prod.getId();
		case 1:
			return prod.getNome();
		}
		// precisa retornar qualquer coisa ja que o metodo diz que precisa
		return "erro matata";
	}
	
	public List<Produto> getListProduto(){
		return listaProdutos;
	}
	
	

}
