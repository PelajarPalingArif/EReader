package com.astar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/astar/scene.fxml"));
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/com/astar/style.css").toExternalForm());

            stage.setTitle("Test Application");
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    public static void main(String[] args) {
        launch(args);
    }
}