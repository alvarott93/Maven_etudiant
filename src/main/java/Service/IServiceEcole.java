package Service;

public interface IServiceEcole {
	
	public void selectAllEcole();
	public void selectByIdEcole(int id);
	public void createEcole(Etudiant etudiant);
	public void deleteById(int id);
	

}
