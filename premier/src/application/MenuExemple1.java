package application;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class MenuExemple1 extends Application {
@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("Exemple de menu");
BorderPane root = new BorderPane();
//Cr�ation de la barre de menus
MenuBar menubar = new MenuBar();
//Cr�ation du menu principal Fichiers
Menu menufichier= new Menu("Fichiers");
//Cr�ation du sous choix Nouveau associ� avec une image

MenuItem nouveau=new MenuItem();

nouveau.setText("Nouveau");
nouveau.setStyle("t");

//Cr�ation du sous choix Ouvrir associ� avec une combinaiason de touches
MenuItem ouvrir = new MenuItem("Ouvrir");

ouvrir.setAccelerator(new KeyCodeCombination(KeyCode.O,KeyCombination.SHORTCUT_DOWN));

//Cr�ation du sous choix Enregistrer
MenuItem sauver = new MenuItem("Enregistrer");
//Cr�ation du sous choix Quitter
MenuItem quitter = new MenuItem("Quitter");
//Ajout des sous sous choix au menu Fichier avec un s�parateur
menufichier.getItems().addAll(nouveau, ouvrir, sauver ,
new SeparatorMenuItem(), quitter);

//Cr�ation des menus principaux Vue et Alarme
Menu menuvue = new Menu("Vue");
CheckMenuItem vue1 = new CheckMenuItem("Salon");
CheckMenuItem vue2 = new CheckMenuItem("Salle � manger");
CheckMenuItem vue3 = new CheckMenuItem("Jardin");
CheckMenuItem vue4 = new CheckMenuItem("Garage");
vue1.setSelected(true);
vue3.setSelected(true);
menuvue.getItems().addAll(vue1, vue2, vue3, vue4);
Menu menualarme = new Menu("Alarme");
//Cr�ation du toggle group
ToggleGroup etat = new ToggleGroup() ;
//Cr�ation d'un sous-menu radio
RadioMenuItem active = new RadioMenuItem("Activ�e");
//Cr�ation d'un sous-menu radio
RadioMenuItem desactive = new RadioMenuItem("D�sactiv�e");
//Ajout des sous-menu radio dans le toggle group
active.setToggleGroup(etat);
desactive.setToggleGroup(etat);
//Marquage par d�faut du sous-menu radio desactive
desactive.setSelected(true);
//Ajout des sous-menus radio au menu alarme
menualarme.getItems().addAll(active,desactive);


//Ajout des menus � la barre de menus
menubar.getMenus().addAll(menufichier, menuvue, menualarme);
root.setTop(menubar);
Scene scene = new Scene(root, 700,400);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}