package tests;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import decorator.utilities.CarDecoratorInterface;
import decorator.utilities.DecoratedCar;
import decorator.DigitalClocks;
import decorator.HeatedSeats;
import factory.CarFactory;
import org.junit.Test;
import pubsub.*;


public class CarPublisherTest {
    @Test
    public void publishTest() {
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
        CarDecoratorInterface carDecorations = new DigitalClocks(new HeatedSeats(new DecoratedCar(car)));
        carDecorations.decorateCar();
        System.out.println();

        Message thirdStage = new Message("KACPR", "Production ended");
        engineer.publish(thirdStage, pubSubService);


        client.addSubscriber("KACPR",pubSubService);

        Message fourthStage = new Message("KACPER", "Your car is ready for pickup");
        dealer.publish(fourthStage, pubSubService);
        fourthStage = new Message("KACPR", "Your car is ready for pickup");
        dealer.publish(fourthStage, pubSubService);
    }
}
