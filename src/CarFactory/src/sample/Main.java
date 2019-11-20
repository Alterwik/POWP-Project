package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//TODO
//        abstract factory - zrobione
//        observer
//        decorator
//        builder - zrobione
//        publish subscriber (subskrypcja na dostraczenie produktu)
//        wizualizacja procesu produkcji samochodu z drzewkiem wyboru opcji, pakietów i dekoratorów

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Car Factory Main Interface");
        primaryStage.setScene(new Scene(root, 700, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }
}
