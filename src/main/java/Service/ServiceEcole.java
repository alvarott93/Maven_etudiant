package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.IEtudiantDAO;

@Service
public class ServiceEcole implements IServiceEcole{
	
	@Autowired
	IEtudiantDAO dao;
	
	

	public void setDao(IEtudiantDAO dao) {
		this.dao = dao;
	}

	public void selectAllEcole() {
		System.out.println(dao.selectAll());
		
	}

	public void selectByIdEcole(int id) {
		System.out.println("id en servecole es "+id+" entrada");
		System.out.println(dao.selectById(id));
		System.out.println("id en servecole es "+id+" salida");
	}

	public void createEcole(Etudiant etudiant) {
		dao.createEtudiant(etudiant);
		
	}

	public void deleteById(int id) {
		dao.deleteById(id);
		
	}


	
	

}
