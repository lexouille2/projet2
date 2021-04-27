/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.jacob.project.dessin.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import static javafx.application.Application.launch;
import javafx.stage.Stage;
/**
 *
 * @author PC
 */
public class Main extends Application {

    public void start(Stage stage) {
        Scene sc = new Scene(new BoiteACoucou());
        stage.setScene(sc);
          stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}