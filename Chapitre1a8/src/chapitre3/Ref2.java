
package chapitre3;

public class Ref2 {
	public static void main(String[] args) {
		int[] tabm = null;
		// la variable r�f�rence tabm est initialis�e avec la r�f�rence null
		int i;
		tabm = fct(tabm); // Appel de la fonction fct()
		System.out.print("1ere valeur: ");
		System.out.println(tabm[0]);
		System.out.print("Dans main(), apr�s appel : ");
		for (i = 0; i < tabm.length; i++)
			System.out.print(tabm[i] + " ");
		System.out.println();
	}

	// DEFINITION de la fonction fct() :
	public static int[] fct(int[] t) {
		t = new int[] { 10, 20 };
		return t ;
	}
}