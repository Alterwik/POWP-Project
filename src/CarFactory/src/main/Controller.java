package main;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import decorator.DigitalClocks;
import decorator.HeatedSeats;
import decorator.ParkingSensors;
import decorator.Tablets;
import factory.CarFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import pubsub.*;

public class Controller {

    @FXML
    Label label1;

    @FXML
    Button buildCarButton, europeButton, japanButton, usaButton, garageButton,
            cityCarButton, classicCareButton, sportsCarButton, truckButton,
            submitDecoration;
    @FXML
    CheckBox dcCheckBox, hsCheckBox, psCheckBox, tCheckBox;

    CarFactory carFactory = new CarFactory();
    Car car;

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
        if (actionEvent.getSource() == europeButton) {
            System.out.println("EUROPEAN car will be proudly made !!");
            this.carFactory.setCarProductionRegion(CarProductionRegion.EUROPE);
            System.out.println(this.carFactory.getCarProductionRegion());// TODO fix: car factory is removed from controller every time
        }else if (actionEvent.getSource() == japanButton) {
            System.out.println("JAPANESE car will be proudly made !!");
            this.carFactory.setCarProductionRegion(CarProductionRegion.JAPAN);
        }else if (actionEvent.getSource() == usaButton) {
            System.out.println("AMERICAN car will be proudly made !!");
            this.carFactory.setCarProductionRegion(CarProductionRegion.USA);
        }else if (actionEvent.getSource() == garageButton) {
            System.out.println("KIT car will be proudly made !!");
            this.carFactory.setCarProductionRegion(CarProductionRegion.GARAGE);
        }else return;
        Stage stage = (Stage) europeButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/carType.fxml");
    }

    public void chooseCarType(ActionEvent actionEvent) {
        if (actionEvent.getSource() == cityCarButton) {
            System.out.println("cityCar");
            this.car = carFactory.create(CarType.CITY_CAR);
        }else if (actionEvent.getSource() == classicCareButton) {
            System.out.println("classicCar");
            this.car = carFactory.create(CarType.CLASSIC_CAR);
        }else if (actionEvent.getSource() == sportsCarButton) {
            System.out.println("sportsCar");
            this.car = carFactory.create(CarType.SPORTS_CAR);
        }else if (actionEvent.getSource() == truckButton) {
            System.out.println("truck");
            this.car = carFactory.create(CarType.TRUCK);
        }else return;
        Stage stage = (Stage) cityCarButton.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/decorationCheckbox.fxml");
    }

    public void chooseCarDecoration(ActionEvent actionEvent) {
        if (actionEvent.getSource() == submitDecoration){
            if(dcCheckBox.isSelected()) {
                System.out.println("dc");
                this.car = new DigitalClocks(car);
            }
            if(hsCheckBox.isSelected()) {
                System.out.println("hs");
                this.car = new HeatedSeats(car);
            }
            if(psCheckBox.isSelected()) {
                System.out.println("ps");
                this.car = new ParkingSensors(car);
            }
            if(tCheckBox.isSelected()) {
                System.out.println("tablets");
                this.car = new Tablets(car);
            }
        } else return;
        Stage stage = (Stage) dcCheckBox.getScene().getWindow();
        ScreenController.changeScene(stage, "utilities/welcome.fxml");
        System.out.println(car.toString());
    }
}
