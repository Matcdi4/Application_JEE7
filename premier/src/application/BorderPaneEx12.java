package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class BorderPaneEx12 extends Application {
@Override
public void start(Stage primaryStage) {
// Titre de la fen�tre
primaryStage.setTitle("Un exemple de BorderPane");
// Cr�ation de la racine - decors -
BorderPane root = new BorderPane() ;
//Installation du gestionnaire
root.setOnMouseClicked(new EventHandler<MouseEvent>() {
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Vous avez cliqu�");
		
		MouseButton b = arg0.getButton();
		System.out.println(b);
		//OU System.out.println(b.name());
		// Coordonn�es relatives du clic par-rapport � la source de l'�v�nement
		System.out.println("X : "+arg0.getX());
		System.out.println("Y : "+arg0.getY());
		// Coordonn�es relatives du clic par-rapport � l'�cran
		System.out.println("Dans l'�cran X : "+arg0.getScreenX());
		System.out.println("Dans l'�cran Y : "+arg0.getScreenY());
		// Coordonn�es relatives du clic par-rapport � la sc�ne
		System.out.println("Dans la sc�ne X : "+arg0.getSceneX());
		System.out.println("Dans la sc�ne Y : "+arg0.getSceneY());
		System.out.println("Nombre de clic : "+arg0.getClickCount());
		
	}
		
});
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