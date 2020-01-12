package main;

import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import decorator.DigitalClocks;
import decorator.HeatedSeats;
import decorator.ParkingSensors;
import decorator.Tablets;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import observer.ProductionEndedObserver;
import observer.Subject;
import pubsub.*;
import singleton.CarList;

public class Controller {

    @FXML
    Label label1;

    @FXML
    Button buildCarButton, europeButton, japanButton, usaButton, garageButton,
            cityCarButton, classicCareButton, sportsCarButton, truckButton,
            submitDecoration;
    @FXML
    CheckBox dcCheckBox, hsCheckBox, psCheckBox, tCheckBox;

    private static PubSubService pubSubService = new PubSubService();
    private static Publisher dealer = new PublisherImpl();
    private static Publisher engineer = new PublisherImpl();
    private static Subscriber client = new SubscriberImpl();

    public void buildCar(ActionEvent actionEvent) {
        Stage stage = (Stage) buildCarButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/factory.fxml");

        client.addSubscriber("KACPER", pubSubService);

        Message firstStage = new Message("KACPER", "Thanks for buying car");
        dealer.publish(firstStage, pubSubService);

        Message secondStage = new Message("KACPER", "Production started");
        engineer.publish(secondStage, pubSubService);
    }

    public void chooseFactory(ActionEvent actionEvent) {
        if (actionEvent.getSource() == europeButton) {
            CarList.getInstance().carFactory.setCarProductionRegion(CarProductionRegion.EUROPE);
        }else if (actionEvent.getSource() == japanButton) {
            CarList.getInstance().carFactory.setCarProductionRegion(CarProductionRegion.JAPAN);
        }else if (actionEvent.getSource() == usaButton) {
            CarList.getInstance().carFactory.setCarProductionRegion(CarProductionRegion.USA);
        }else if (actionEvent.getSource() == garageButton) {
            CarList.getInstance().carFactory.setCarProductionRegion(CarProductionRegion.GARAGE);
        }else return;
        Stage stage = (Stage) europeButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/carType.fxml");
    }

    public void chooseCarType(ActionEvent actionEvent) {
        if (actionEvent.getSource() == cityCarButton) {
            CarList.getInstance().addCar(CarList.getInstance().carFactory.create(CarType.CITY_CAR));
        }else if (actionEvent.getSource() == classicCareButton) {
            CarList.getInstance().addCar(CarList.getInstance().carFactory.create(CarType.CLASSIC_CAR));
        }else if (actionEvent.getSource() == sportsCarButton) {
            CarList.getInstance().addCar( CarList.getInstance().carFactory.create(CarType.SPORTS_CAR));
        }else if (actionEvent.getSource() == truckButton) {
            CarList.getInstance().addCar(CarList.getInstance().carFactory.create(CarType.TRUCK));
        }else return;
        Stage stage = (Stage) cityCarButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/decorationCheckbox.fxml");
    }

    public void chooseCarDecoration(ActionEvent actionEvent) {
        if (actionEvent.getSource() == submitDecoration){
            if(dcCheckBox.isSelected()) {
                CarList.getInstance().addDecorationToLastCar(new DigitalClocks(CarList.getInstance().getLastCar()));
            }
            if(hsCheckBox.isSelected()) {
                CarList.getInstance().addDecorationToLastCar(new HeatedSeats(CarList.getInstance().getLastCar()));
            }
            if(psCheckBox.isSelected()) {
                CarList.getInstance().addDecorationToLastCar(new ParkingSensors(CarList.getInstance().getLastCar()));
            }
            if(tCheckBox.isSelected()) {
                CarList.getInstance().addDecorationToLastCar(new Tablets(CarList.getInstance().getLastCar()));
            }
        } else return;

        Message thirdStage = new Message("KACPER", "Production Ended");
        dealer.publish(thirdStage, pubSubService);

        Subject sub = new Subject();
        new ProductionEndedObserver(sub);
        sub.setState(CarList.getInstance().getLastCar().toString());

        Stage stage = (Stage) dcCheckBox.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/welcome.fxml");
        System.out.println(CarList.getInstance().getCarList().toString());
    }
}
