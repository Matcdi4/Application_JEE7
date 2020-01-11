package chapitre3;

public class Ref1 {
	public static void main(String[] args) {
		
		double r = 11* Math.random();
		int e = 10+(int)(r) ;
		
		System.out.println("Nombre al�atoire = "+r);
		System.out.println("Nombre al�atoire entier = "+e);
		int[] tabm; // (*1)
		tabm = new int[] { 4, 5, 6 }; // (*2)
		int i;
		System.out.print("Dans main(), avant appel : ");
		for (i = 0; i < tabm.length; i++)
			System.out.print(tabm[i] + " ");
		System.out.println();
		fct(tabm); // Appel de la fonction fct()
		System.out.print("Dans main(), apr�s appel : ");
		for (i = 0; i < tabm.length; i++)
			System.out.print(tabm[i] + " ");
		System.out.println();
	}

	// DEFINITION de la fonction fct() :
	// elle incr�mente tous les �l�ments d'un tableau d'entiers pass�s en
	// param�tre
	public static void fct(int[]t) {
		int i;
		for (i = 0; i < t.length; i++)
			t[i] = t[i]+1;
	}
}