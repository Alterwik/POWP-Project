package sample;

import car.CarType;
import factory.AbstractFactory;
import factory.FactoryProvider;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//TODO
//        abstract factory ( fabryka tworząca fabrykę samochodów sportowych, dostawczych, miejskich i rodzinnych )
//        observer
//        decorator
//        builder
//        publish subscriber subskrypcja na dostraczenie produktu

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
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory sportsCarFactory = factoryProvider.getFactory("sportscar");
        sportsCarFactory.create(CarType.SPORTS_CAR);
    }
}
