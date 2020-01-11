package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;



import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class DrawLines extends Application {
@Override
public void start(Stage primaryStage) {
// Titre de la fen�tre
primaryStage.setTitle("Dessins de 4 lignes et d'un rectangle");
// Cr�ation du d�cors
Group root = new Group() ;
// On place le d�cors dans la sc�ne + taille et couleur de fond de la sc�ne
Scene scene = new Scene(root,500,300,Color.GRAY);
// On remplit le d�cors...
Line ligne1 = new Line(10,10,200,50);
// avec une 1�re ligne
root.getChildren().add(ligne1);
Line ligne2 = new Line(10,50,200,110);
ligne2.setStroke(Color.PINK); // couleur rose
ligne2.setStrokeWidth(10); // largeur du trait
ligne2.setStrokeLineCap(StrokeLineCap.ROUND); //extr�mit�s arrondies
// avec une 2�me ligne
root.getChildren().add(ligne2);
Text texte = new Text(20,180,"Une ligne bleue");
root.getChildren().add(texte);
Line ligne3 = new Line(20,250,220,150);
ligne3.setStroke(Color.BLUE);
ligne3.setStrokeWidth(15);
ligne3.setStrokeLineCap(StrokeLineCap.SQUARE); //extr�mit�s carr�es
// avec une 3�me ligne
root.getChildren().add(ligne3);
Line ligne4 = new Line(250,250,450,280);
ligne4.setStroke(Color.CORAL); // couleur corail
ligne4.setStrokeWidth(5); // largeur du trait
ligne4.setStrokeLineCap(StrokeLineCap.BUTT); //extr�mit�s carr�es
ligne4.setStrokeDashOffset(10);
ligne4.getStrokeDashArray().addAll(15d,5d); // traits tiret�s
// avec une 4�me ligne
root.getChildren().add(ligne4);
Rectangle rect = new Rectangle(300,10,80,40);
rect.setFill(Color.RED);
// avec un rectangle
root.getChildren().add(rect);



// On place la sc�ne dans la fen�tre th�atre
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}