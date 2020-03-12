package DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import Service.Etudiant;
import Service.ConnexionDB;

@Repository
public class EtudiantDAO implements IEtudiantDAO{
	
	//O asi o con el singleton
	//SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
	//Session session = sessionfactory.openSession();

	public int createEtudiant(Etudiant etudiant) {
		Session session = ConnexionDB.getInstance().getFactory().openSession(); //utilizando el singleton!!!!!
		session.beginTransaction();
		session.save(etudiant);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

	public List<Etudiant> selectAll() {
		Session session = ConnexionDB.getInstance().getFactory().openSession(); //utilizando el singleton!!!!!
		try {
			List<Etudiant> liste= new ArrayList<Etudiant>();
			session.beginTransaction();
			String requete ="select * from etudiant";
			SQLQuery query= session.createSQLQuery(requete);
			query.addEntity(Etudiant.class);
			session.close();
			session.close();
			return query.list();
		} catch (Exception e) {
			return null;
		}
		
	}

	public List<Etudiant> selectById(int id) {
		Session session = ConnexionDB.getInstance().getFactory().openSession(); //utilizando el singleton!!!!!
		try {
			List<Etudiant> liste=new ArrayList<Etudiant>();
			session.beginTransaction();
			Query query = session.createQuery("from Etudiant where idEtudiant= :idEtu");
			query.setParameter("idEtu", id);
			session.close();
			// Etudiant etudiant = (Etudiant) query.uniqueResult(); para recuperar el unico resultado!!!!
			return query.list();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public int deleteById(int id) {
		Session session = ConnexionDB.getInstance().getFactory().openSession(); //utilizando el singleton!!!!!
		session.beginTransaction();
		System.out.println("0");
		//Query query = session.createQuery("from Etudiant where idEtudiant = :idEtu");
		System.out.println("1");
		System.out.println("el id buscado es :"+id);
		//query.setParameter("idEtu", id);
		System.out.println("2");
		//System.out.println("la lista es"+query.list());
		System.out.println("3");
		Etudiant etud=new Etudiant();
		etud.setIdEtudiant(id);
		//Etudiant etudiant= (Etudiant) query.list();
		session.delete(etud);
		session.close();
		return 0;
	}

}
