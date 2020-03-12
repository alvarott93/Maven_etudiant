package Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class MainClass {
	
	public static void main(String[] args) {
		
		Etudiant e1 = new Etudiant("Toribio", "Alvaro", "G1");
		
		ApplicationContext context = new FileSystemXmlApplicationContext("ConfigurationFile.xml");
		IServiceEcole serEco = (IServiceEcole) context.getBean("etudserv");
		//serEco.createEcole(e1);
		serEco.deleteById(1);
		//serEco.selectByIdEcole(2);
		serEco.selectAllEcole();
		
		// au cas qu'on utilise les notations
		//AnnotationConfigApplicationContext bob = new AnnotationConfigApplicationContext();*
		//bob.scan("Maven_Ecolee.DAO");
		//bob.scan("Maven_Ecolee.Service");
		//bob.refresh();
		//a partir de qui igual usando bob.getbean....
		
		
		
		
	
		
	}

}
