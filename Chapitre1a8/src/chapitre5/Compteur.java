package chapitre5;

public class Compteur {

	private int valeur;
	public void affiche() {
		System.out.println("Valeur du compteur="+valeur);
		
	}
	public void incremente() {
		valeur++;
	}
	public void decremente() {
		if(valeur >0) valeur--;
	}
	public static void main (String argv[]) {
		Compteur c1=new Compteur();
		c1.affiche();
		int i=0;
		while(i++<10) c1.incremente();
		System.out.println("Apr�s 10 d�crementations");
		c1.affiche();
		i=0;
		while (i++<20) c1.decremente();
		System.out.println("Apr�s 20 d�crementations");
		c1.affiche();
		
	}
}
