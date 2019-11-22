package tests;


import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import decorator.*;
import decorator.utilities.CarDecoratorInterface;
import decorator.utilities.DecoratedCar;
import factory.CarFactory;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarDecoratorTest {

    @Test
    public void shouldDecorateWithSeatsAndClocks() {
        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(CarProductionRegion.USA);
        Car car = carFactory.create(CarType.CITY_CAR);
        CarDecoratorInterface carDecorations = new DigitalClocks(new HeatedSeats(new DecoratedCar(car)));

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));
        carDecorations.decorateCar();
        Assertions.assertEquals(car.toString() + " HEATED SEATS DIGITAL CLOCKS", outContent.toString());
    }

    @Test
    public void shoulddo() {
        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(CarProductionRegion.JAPAN);
        Car car = carFactory.create(CarType.SPORTS_CAR);
        System.out.println(car);// regular car
        //CarDecoratorInterface carDecorations = new HeatedSeats(new DecoratedCar(car));//TODO decorateCar() should return DecoratedCar
        //carDecorations.decorateCar();
        /*TODO commented part should work
        DecoratedCar dc = new HeatedSeats(new DecoratedCar(car));
        */
        System.out.println("----");
        System.out.println(car);//TODO this car should be decorated


//
    }
}
