package tests;


import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import decorator.*;
import factory.CarFactory;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarDecoratorTest {

    @Test
    public void checkDecorator() {
        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(CarProductionRegion.USA);
        Car car = carFactory.create(CarType.CITY_CAR);
        CarDecoratorInterface carDecorations = new DigitalClocks(new HeatedSeats(new DecoratedCar(car)));

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        carDecorations.decorateCar();
        Assertions.assertEquals(car.toString() + " HEATED SEATS DIGITAL CLOCKS", outContent.toString());
    }
}
