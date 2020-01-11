package chapitre3;

public class Echange {
	public static void main(String[] args) {
		int n = 10, p = 20;
		System.out.println("Dans main(), avant appel : " + n + " ," + p);
		echange(n, p); // Appel de la fonction echange()
		System.out.println("Dans main(), apr�s appel : " + n + " ," + p);
	}
	
	public static float fexple(float x, int b, int c) // ent�te de la fonction membre fexple ()
	{ // d�but du corps de la fonction membre
		
		int z = (int)x*b ;
		
	return (x * x + b * x + c) ;
	}		

	// DEFINITION de la fonction echange() :
	// Cette fonction tente de permuter les 2 param�tres qui lui sont transmis
	public static void echange(int a, int b) {
		int temp;
		System.out.println("Dans echange(), avant permutation : " + a + " ," + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Dans echange(), apr�s permutation : " + a + " ," + b);
	}
}