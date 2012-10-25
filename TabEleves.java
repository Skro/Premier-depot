
public class TabEleves {
	
	private Eleve[] val; //= new Eleve [36];
	private int nb = 0;
	
	public TabEleves(){
		
	}

	public int getNb() {
		return nb;
	}
	
	public void ajouter(Eleve ele){//ajoute un élève dans le tableau
		val[nb] = ele;
		System.out.println(val[nb]);
		nb ++;
	}
	
	public Eleve valeur(int i){
		return val[i];
	}
	
	public void supprimer(int i){
		
	}
	
}
