package chapitre3;

import java.util.Scanner; // classe utilis�e pour r�aliser les saisies

public class Hypotenuse {
	public static void main(String[] args) {
		// Declaration des variables locales de la fonction main()
		double am, bm, hypom; // m comme main()
		Scanner sc; // d�claration d'une variable r�f�rence destin�e � pointer
					// sur un objet de type
		// Scanner
		sc = new Scanner(System.in); // Cr�ation de l'objet de type classe
										// Scanner, l'op�rateur new

		// renvoie une r�f�rence sur cet objet
		// appel de la fonction print() pour l'objet r�f�renc� par out
		System.out.print("--> Veuillez saisir la longueur du premier cot� : ");
		am = sc.nextDouble(); // appel de la fonction nextDouble() pour l'objet
								// r�f�renc� par sc
		System.out.print("--> Veuillez saisir la longueur du second cot� : ");
		bm = sc.nextDouble();
		// 1er appel de la fonction calculHypotenuse()
		hypom = calculHypotenuse(am, bm);
		System.out.println("1. Longueur de l'hypot�nuse du triangle rectangle");
		System.out.println(" de cot�s " + am + " et " + bm + " : " + hypom + "\n");
		// 2�me appel de la fonction calculHypotenuse()
		hypom = calculHypotenuse(am + 2.5, 7.8);
		System.out.println("2. Longueur de l'hypot�nuse du triangle rectangle");
		System.out.println(" de cot�s " + (am + 2.5) + " et " + 7.8 + " : " + hypom + "\n");
	}

	/*
	 * DEFINITION de la fonction membre calculHypotenuse() Fonction qui calcule
	 * la longueur de l'hypot�nuse d'un triangle rectangle : - 1er param�tre :
	 * longueur du 1er cot� - 2�me param�tre : longueur du second cot� - valeur
	 * de retour : l'hypot�nuse
	 */
	public static double calculHypotenuse(double a, double b) // ent�te de la
																// fonction
																// membre
	{ // d�but du corps de la fonction membre calculHypotenuse()
		// d�claration des variables locales de la fonction calculHypotenuse()
		double res;
		// appel de la fonction statique sqrt(). Cette fonction fait partie de
		// la classe Math
		res = Math.sqrt(a * a + b * b);
		return res; // => retour dans la fonction appelante (ici, il s'agit de
					// la fonction main())
		// en renvoyant la valeur de res
	} // fin du corps de la fonction membre calculHypotenuse()
} // fin de la d�finition de la classe Hypotenuse