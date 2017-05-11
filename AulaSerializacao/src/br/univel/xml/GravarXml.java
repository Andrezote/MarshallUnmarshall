package br.univel.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class GravarXml {
	
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setId(1);
		p.setNome("Nome");
		
		try {
			File file = new File("file.xml");
			JAXBContext jaxbContext;
			
			jaxbContext = JAXBContext.newInstance(Produto.class);
			
			//organizar e agrupar o contexto da classe produto setado acima
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			//se voce nao colocar como true ele nao formata
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			jaxbMarshaller.marshal(p, file);
			jaxbMarshaller.marshal(p, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
		
		
		
}
