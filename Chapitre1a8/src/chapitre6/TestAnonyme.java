package chapitre6;

public class TestAnonyme  {
	
	//1�re classe interne anonyme, objet lion
	Animal lion = new Animal() {
		
	public void parler() {
	System.out.println("Je rugis comme un lion");
	}
};
	//2�me classe interne anonyme, objet chien
	Animal chien = new Animal() {
		
	public void parler() {
	System.out.println("J'aboie comme un chien");
	}
};
	
	
	public static void main(String[] args) {
	TestAnonyme t = new TestAnonyme() ;
	t.lion.parler();
	t.chien.parler();
	}
}