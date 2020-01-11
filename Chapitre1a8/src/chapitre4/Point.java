package chapitre4;

public class Point {
	private double x; // abscisse
	private double y; // ordonn�e

	//////////////////////////////////
	/////Constructeur
	public Point() {
		x=10;
		y=20;
		System.out.println("Constructeur sans argument");
	}
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	// Accesseur du type get
	public double getX() {		
		return x ;
	}
	public double getY() {
		return y ;
	}
	public void place(double xnew, double ynew) {
		x = xnew; // on affecte dans l'attribut x la valeur re�ue en 1er
					// param�tre
		y = ynew;
	}
	public void place(double n){
		x = n ;
		y = n ;
	}

	public void deplace(double dx, double dy) {
		x += dx; // on ajoute � l'attribut x la valeur re�ue en 1er param�tre
		y += dy;
	}

	public void affiche() {
		System.out.println("x = " + x + ", y = " + y);
	}
}
