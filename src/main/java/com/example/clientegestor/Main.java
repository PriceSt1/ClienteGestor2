package com.example.clientegestor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    public static Scene scene;

    public Main() {

    }


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("view/vistaLogin"));
        stage.setTitle("Gestor Clientes");
        stage.setScene(scene);
        stage.show();

    }
    public static void setRoot(String fxml) throws IOException{
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args){ launch(); }
}
