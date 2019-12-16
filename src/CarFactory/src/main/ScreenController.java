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












//    private HashMap<String, Pane> screenMap = new HashMap<>();
//    private Scene main;

//    public ScreenController() {
//        try {
//            addScreen("carType", FXMLLoader.load(getClass().getResource( "utilities/carType.fxml" )));
//            addScreen("decorationCheckbox", FXMLLoader.load(getClass().getResource( "utilities/decorationCheckbox.fxml" )));
//            addScreen("factory", FXMLLoader.load(getClass().getResource( "utilities/factory.fxml" )));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

//    protected void addScreen(String name, Pane pane){
//        screenMap.put(name, pane);
//    }

//    protected void removeScreen(String name){
//        screenMap.remove(name);
//    }

//    protected static void activate(String name, Stage stage){
////        this.main = main;
//        stage.setScene(this.main);
//        stage.show();
//        this.main.setRoot( screenMap.get(name) );
//    }
//
//}
