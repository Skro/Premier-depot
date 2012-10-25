import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TabEleves[] tab = new TabEleves [36];
//		
//		
//		saisirEleve(e1);
//		tab.ajouter(e1);
//		tab[0] = e1;
		
		Eleve e1 = new Eleve("COT", 15);
		TabEleves tab = new TabEleves();
		tab.ajouter(e1);

	}
	
	public static Eleve saisirEleve(Eleve elev){
		String unNom;
		int uneNote;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir votre nom :");
		unNom = sc.nextLine();
		System.out.println("Saisir votre note :");
		uneNote = sc.nextInt();
		return new Eleve(unNom, uneNote);
	}
	
}
