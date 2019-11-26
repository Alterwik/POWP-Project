package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//TODO
//        abstract factory - zrobione
//        observer
//        decorator - zrobione
//        builder - zrobione
//        publish subscriber (subskrypcja na dostraczenie produktu)
//        wizualizacja procesu produkcji samochodu z drzewkiem wyboru opcji, pakietów i dekoratorów

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("utilities/welcome.fxml"));
        primaryStage.setTitle("Car Factory Main Interface");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();

//        ScreenController screenController = new ScreenController(primaryStage.getScene());
//        screenController.addScreen("carType", FXMLLoader.load(getClass().getResource( "carType.fxml" )));
//        screenController.activate("carType");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
