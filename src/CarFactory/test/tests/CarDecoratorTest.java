package tests;


import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import decorator.CarDecoratorInterface;
import decorator.DigitalClocks;
import decorator.HeatedSeats;
import decorator.ParkingSensors;
import factory.CarFactory;
import org.junit.Test;

public class CarDecoratorTest {

    @Test
    public void checkDecorator() {
        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(CarProductionRegion.USA);
        Car car = carFactory.create(CarType.CITY_CAR);
        CarDecoratorInterface carDecorations = new ParkingSensors(new HeatedSeats());
        carDecorations.decorateCar(car);
        car.getCarDecorations();
    }
}
