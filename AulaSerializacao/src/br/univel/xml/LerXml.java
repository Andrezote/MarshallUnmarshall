package br.univel.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class LerXml {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("file.xml");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Produto.class);
			
			Unmarshaller jaxbUnMarshaller = jaxbContext.
					createUnmarshaller();
			Produto produto = (Produto) jaxbUnMarshaller.
					unmarshal(file);
			
			System.out.println(produto.getId());
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
