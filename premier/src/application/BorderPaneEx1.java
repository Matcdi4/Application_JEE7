package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class BorderPaneEx1 extends Application {

@Override
public void start(Stage primaryStage) {
// Titre de la fen�tre
primaryStage.setTitle("Un exemple de BorderPane");
// Cr�ation de la racine - d�cors -
BorderPane root = new BorderPane() ;
//Insertion des 2 instructions suivantes pour ajouter le bouton au centre du d�cors

GridPane grid = new GridPane();
//La grille est centr�e dans le panneau
grid.setAlignment(Pos.CENTER);
//Largeur de l'espacement horizontal entre les cellules
grid.setHgap(10);
//Largeur de l'espacement vertical entre les cellules
grid.setVgap(10);
//Marge entre la grille et la bordure de la fen�tre
grid.setPadding(new Insets(25, 25, 25, 25));
Button bouton = new Button("Cliquez ici");
root.setCenter(bouton);
// Cr�ation de la sc�ne, association du d�cors et de la sc�ne, taille de la sc�ne
Scene scene = new Scene(root,400,300);
// On place la sc�ne dans la fen�tre
primaryStage.setScene(scene);
// On affiche la fen�tre
primaryStage.show();

}
public static void main(String[] args) {

launch(args);
}
}