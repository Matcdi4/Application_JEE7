package chapitre7;

public class Abonne3 extends Abonne implements Affichable {

	public Abonne3(String nom, String prenom, int age, String telephone) {
		super(nom, prenom, age, telephone);
		// TODO Auto-generated constructor stub
	}
//////////La fonction affichetout() de l�interface affichable est cod�e ici.
public void affichetout()
{
System.out.println("Nom: "+getNom()+ " Pr�nom: "+getPrenom()+"\n");
System.out.println("T�l�phone : "+getTelephone()+"\n");
}
/////////////////////////////////////////////////////////////////////////////////////////////////
}
