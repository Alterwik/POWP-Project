package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ScreenController {

    public static void changeScene(Stage stage, String path) {
        try {
            Parent root = FXMLLoader.load(ScreenController.class.getResource(path));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}
