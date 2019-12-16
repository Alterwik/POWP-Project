package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import pubsub.*;

public class Controller {

    @FXML
    Label label1;

    @FXML
    Button buildCarButton, europeButton, japanButton, usaButton, garageButton;

    public void buildCar(ActionEvent actionEvent) {
        Stage stage = (Stage) buildCarButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/factory.fxml");

//-----------TODO Kacper ??
        PubSubService pubSubService = new PubSubService();
        Publisher dealer = new PublisherImpl();
        Publisher engineer = new PublisherImpl();
        Subscriber client = new SubscriberImpl();

        client.addSubscriber("KACPER", pubSubService);

        Message firstStage = new Message("KACPER", "Thanks for buying car");
        dealer.publish(firstStage, pubSubService);

        Message secondStage = new Message("KACPER", "Production started");
        engineer.publish(secondStage, pubSubService);

//        CarFactory carFactory = new CarFactory();
//        carFactory.setCarProductionRegion(CarProductionRegion.USA);
//        Car car = carFactory.create(CarType.CITY_CAR);

    }

    public void chooseFactory(ActionEvent actionEvent) {
        Stage stage;
        if (actionEvent.getSource() == europeButton) {
            System.out.println("EUROPEAN car will be proudly made !!");
        }else if (actionEvent.getSource() == japanButton) {
            System.out.println("JAPANESE car will be proudly made !!");
        }else if (actionEvent.getSource() == usaButton) {
        System.out.println("AMERICAN car will be proudly made !!");
        }else if (actionEvent.getSource() == garageButton) {
            System.out.println("KIT car will be proudly made !!");
        }
        stage = (Stage) europeButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/carType.fxml");
    }
}
