package DAO;

import java.util.List;

import Service.Etudiant;

public interface IEtudiantDAO {
	
	public int createEtudiant(Etudiant etudiant);
	public List<Etudiant> selectAll();
	public List<Etudiant> selectById(int id);
	public int deleteById(int id);
	

}
