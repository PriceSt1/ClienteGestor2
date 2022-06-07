package com.example.clientegestor;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class personalScene {
    public static Scene scene;
    private final String path;
    private final String title;
    private Stage stage = new Stage();


    public personalScene(String path, String title) {
        this.path = path;
        this.title = title;
    }


    public void start() throws IOException {
        scene = new Scene(loadFXML(this.path));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();

    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }


}
