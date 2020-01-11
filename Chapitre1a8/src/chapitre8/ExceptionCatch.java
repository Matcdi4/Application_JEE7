package chapitre8;

class ExceptionCatch
{
static int moyenne(String[] liste)
{
int somme = 0,entier, nbNotes=0;
for (int i = 0; i < liste.length; i++)
{
try
{
entier = Integer.parseInt(liste[i]);
somme += entier;
nbNotes++;
}
catch (NumberFormatException e)
{
System.out.println("La " + (i+1)+" eme note n'est "+
"pas entiere");
}
}
return somme/nbNotes;
}
public static void main(String[] argv)
{
System.out. println("La moyenne est "+moyenne(argv));
}
}