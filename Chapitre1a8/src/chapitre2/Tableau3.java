package chapitre2;

public class Tableau3{
	
public static void main(String []args) {
	int [] tab1= {4,8,10};
    double [] tab2= {1.3,5.6,7.8,4.75};
    String [] tab3= {"toto", "tata"};
    char [] tab4= {'a','b','c','d'};
	int i; 
	System.out.println("Affichage de tous les �l�ments du tab1:");
	
	for(i=0; i<tab1.length; i++)
		
System.out.println("\tValeur �l'indice:"+i+ ":"+ tab1[i]);

System.out.println(); // saute une ligne
System.out.println("Valeur de i:" +i); 
System.out.println("Modification des 3 derniers �lements du tableau tab2:");

for (i= tab2.length-3; i<tab2.length;i++){
	tab2[i]= 2*i+0.5;
System.out.println("Affichage de tous les �l�ments du tableau tab2:");
}
for ( i=0; i<tab2.length; i++){
	System.out.println("\tValeur � l'indice" +i+ ":"+tab2[i]);

}
}
}