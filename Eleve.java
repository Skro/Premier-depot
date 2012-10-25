
public class Eleve {
	
	private String nom;
	private float note;
	
	public Eleve(){
		
	}
	
	//ajout d'une ligne pour tester si tout fonctionne
	
	public Eleve(String pnom, float pnote){
		this.nom = pnom;
		this.note = pnote;
	}

	public String getNom() {
		return nom;
	}

	public float getNote() {
		return note;
	}
	
	
}
