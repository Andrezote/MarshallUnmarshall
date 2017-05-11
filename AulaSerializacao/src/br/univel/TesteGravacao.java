package br.univel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TesteGravacao {
	public TesteGravacao(){
		List<Aluno> alunos = new ArrayList<>();
		for(int i = 0; i <1000; i++){
			Aluno aluno = new Aluno();
			aluno.setRa(i);
			aluno.setNomeCompleto("Nome Sobrenome" + i);
			alunos.add(aluno);
		}
		
		try {
			File file = new File("arq.alunos");
			FileOutputStream fos = new FileOutputStream(file);
			//array de bites
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(alunos);
			
			oos.flush();
			
			oos.close();
			System.out.println("Foi!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TesteGravacao();
	}

}
