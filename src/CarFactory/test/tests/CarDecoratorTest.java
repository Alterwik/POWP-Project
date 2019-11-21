package tests;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import factory.CarFactory;
import org.junit.jupiter.api.Assertions;

public class CarDecoratorTest {
    public void checkCar(CarProductionRegion expectedCpr, CarType expectedCt) {
        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(expectedCpr);
        Car car = carFactory.create(expectedCt);





    }
}
