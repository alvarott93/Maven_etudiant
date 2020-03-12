package Service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnexionDB {
	
	//vamos a hacer un singleton con la conexion
	
	private SessionFactory factory=null;
	private static ConnexionDB instance=null;  //ConnexionDB est la class
	
	
	public SessionFactory getFactory() {
		if (factory==null) {
			factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	public static ConnexionDB getInstance() {
		if (instance==null) {
			instance= new ConnexionDB();
		}
		return instance;
	}
	
	
	
	

}
