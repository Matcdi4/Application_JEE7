package chapitre7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Annuaire implements Serializable {
	// D�clarer un objet de type classe Vector, impl�mentation ici de l'agr�gation


	private Vector<Abonne> lesAbonnes;
	Iterator <Abonne> it= lesAbonnes.iterator();

	// Le constructeur d�Annuaire cr�e le Vector, �crire ici le constructeur d�Annuaire
	public Annuaire() {
		lesAbonnes= new Vector<Abonne>();
	}
	// ajouter un abonne dans l'annuaire
	public void ajouterAbonne(Abonne abo1) {

		lesAbonnes.add(abo1);


	}

	// relire l'annuaire avec affichage sur l��cran
	public void voirLesAbonnes() {


		for (int i=0; i<lesAbonnes.size() ; i++) {
			Abonne abo = lesAbonnes.get(i);
			abo.afficheAbonne();
		}
	}
	// Pour rechercher un abonn� par son nom
	// Retourne le num�ro trouv� ou null

	public void sauvegarder() {
		
	}
		public static void main(String [] args) {
	
		Vector<Abonne> lesAbonnesDeMonAnnuaire= new Vector<Abonne>();
		
		String filename= "les abonnesDeMonAnuaire";
		if(args.length > 0) {
			filename = args[0];
			}
		for (int i= 0;i<lesAbonnesDeMonAnnuaire.size();i++)
		{
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
		try{
		fos = new FileOutputStream(filename);
		out = new ObjectOutputStream(fos);
		out.writeObject(lesAbonnesDeMonAnnuaire);
		}
		finally {
		out.close();
		}
		}
		catch(IOException ex) {
		ex.printStackTrace();
		}
		}
		
		
		
		
		
		
		
		
		
		
	}
	public String rechercherParLeNom(String ceNom) throws RechercheException{

		for (int i=0; i<lesAbonnes.size() ; i++) {

			Abonne abo = lesAbonnes.get(i);

			if (ceNom.compareTo(abo.getNom())==0) 

				return abo.getTelephone();
		}
		return null ;
	}
	// Pour rechercher un abonn� par son num�ro
	// Retourne le nom trouv� ou null

	public String rechercherParLeNumero(String ceNumero) {


		int n1 ;
		int etat=0;
		for(n1=0 ; n1 < lesAbonnes.size() ; n1 ++) {

			Abonne cestLui= (Abonne)lesAbonnes.get(n1);

			if( cestLui.getTelephone().compareTo( ceNumero ) == 0)
			{
				etat=1;

				return cestLui.getTelephone();

			}
		}
		if(etat == 0) throw new RechercheException();

		return "";
	}


	// Pour rechercher un abonn� par son num�ro et le supprimer
	public boolean supprimerParLeNumero(String ceNumero) {

		for (int i=0;i<lesAbonnes.size();i++) {


			Abonne abo1= lesAbonnes.get(i);

			if (ceNumero!=null) {

				lesAbonnes.removeElement(abo1);
				return true;
			}

		}
		return false;
	}
	// Pour rechercher un abonn� par son nom et le supprimer
	public boolean supprimerParLeNom(String ceNom) {

		return false;

	}
	// Pour rechercher un abonn� par son nom et son pr�nom
	// Retourne le num�ro trouv� ou null
	public String rechercherParLeNom(String ceNom, String cePrenom) {
		return null;

	}

}
/*
Travail
Compl�ter le code de la classe
 */