package main;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import factory.CarFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pubsub.*;

public class Controller {
    @FXML
    Label label1;
    public void buildCar(ActionEvent actionEvent) {
        PubSubService pubSubService = new PubSubService();
        Publisher dealer = new PublisherImpl();
        Publisher engineer = new PublisherImpl();
        Subscriber client = new SubscriberImpl();

        client.addSubscriber("KACPER", pubSubService);

        Message firstStage = new Message("KACPER", "Thanks for buying car");
        dealer.publish(firstStage, pubSubService);

        Message secondStage = new Message("KACPER", "Production started");
        engineer.publish(secondStage, pubSubService);

        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(CarProductionRegion.USA);
        Car car = carFactory.create(CarType.CITY_CAR);


        label1.setText("Production started!!");
    }
}
