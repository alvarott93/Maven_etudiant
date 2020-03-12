package Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue
	private int idEtudiant;
	private String nomEtudiant;
	private String PrenomEtudiant;
	private String groupEtudiant;
	
	
	
	public Etudiant() {
		super();
	}

    

	public Etudiant(String nomEtudiant, String prenomEtudiant, String groupEtudiant) {
		super();
		this.nomEtudiant = nomEtudiant;
		PrenomEtudiant = prenomEtudiant;
		this.groupEtudiant = groupEtudiant;
	}



	public Etudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String groupEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.nomEtudiant = nomEtudiant;
		PrenomEtudiant = prenomEtudiant;
		this.groupEtudiant = groupEtudiant;
	}



	public int getIdEtudiant() {
		return idEtudiant;
	}



	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}



	public String getNomEtudiant() {
		return nomEtudiant;
	}



	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}



	public String getPrenomEtudiant() {
		return PrenomEtudiant;
	}



	public void setPrenomEtudiant(String prenomEtudiant) {
		PrenomEtudiant = prenomEtudiant;
	}



	public String getGroupEtudiant() {
		return groupEtudiant;
	}



	public void setGroupEtudiant(String groupEtudiant) {
		this.groupEtudiant = groupEtudiant;
	}



	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" + nomEtudiant + ", PrenomEtudiant="
				+ PrenomEtudiant + ", groupEtudiant=" + groupEtudiant + "]";
	}
	
	

}
