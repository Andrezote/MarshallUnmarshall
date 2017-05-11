package br.univel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TesteLeitura {
	
	public TesteLeitura() {
		
		try {
			File file = new File("arq.alunos");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			//downcast precisa forçar o cast, nesse caso transformando obj em aluno
			List<Aluno> aluno = (List<Aluno>)obj;
			
			ois.close();
			
			for (Aluno alunos : aluno) {
				System.out.println(alunos.getNomeCompleto());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new TesteLeitura();
	}

}
