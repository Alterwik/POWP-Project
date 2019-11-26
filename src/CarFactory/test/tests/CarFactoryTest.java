package tests;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import factory.CarFactory;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CarFactoryTest {

    public void checkCar(CarProductionRegion expectedCpr, CarType expectedCt) {
        CarFactory carFactory = new CarFactory();
        carFactory.setCarProductionRegion(expectedCpr);
        Car car = carFactory.create(expectedCt);
        Assertions.assertSame(expectedCt, car.getCarType());
        Assertions.assertSame(expectedCpr, car.getCarProductionRegion());
        Assertions.assertEquals(expectedCt + " build in " + expectedCpr, car.toString());
    }

    @Test
    public void shouldCreateUsaCityCar() {
        checkCar(CarProductionRegion.USA, CarType.CITY_CAR);
    }

    @Test
    public void shouldCreateUsaClassicCar() {
        checkCar(CarProductionRegion.USA, CarType.CLASSIC_CAR);
    }

    @Test
    public void shouldCreateUsaSportsCar() {
        checkCar(CarProductionRegion.USA, CarType.SPORTS_CAR);
    }

    @Test
    public void shouldCreateUsaTruck() {
        checkCar(CarProductionRegion.USA, CarType.TRUCK);
    }

    @Test
    public void shouldCreateEuropeCityCar() {
        checkCar(CarProductionRegion.EUROPE, CarType.CITY_CAR);
    }

    @Test
    public void shouldCreateEuropeClassicCar() {
        checkCar(CarProductionRegion.EUROPE, CarType.CLASSIC_CAR);
    }

    @Test
    public void shouldCreateEuropeSportsCar() {
        checkCar(CarProductionRegion.EUROPE, CarType.SPORTS_CAR);
    }

    @Test
    public void shouldCreateEuropeTruck() {
        checkCar(CarProductionRegion.EUROPE, CarType.TRUCK);
    }

    @Test
    public void shouldCreateJapanCityCar() {
        checkCar(CarProductionRegion.JAPAN, CarType.CITY_CAR);
    }

    @Test
    public void shouldCreateJapanClassicCar() {
        checkCar(CarProductionRegion.JAPAN, CarType.CLASSIC_CAR);
    }

    @Test
    public void shouldCreateJapanSportsCar() {
        checkCar(CarProductionRegion.JAPAN, CarType.SPORTS_CAR);
    }

    @Test
    public void shouldCreateJapanTruck() {
        checkCar(CarProductionRegion.JAPAN, CarType.TRUCK);
    }

    @Test
    public void shouldCreateKitCityCar() {
        checkCar(CarProductionRegion.GARAGE, CarType.CITY_CAR);
    }

    @Test
    public void shouldCreateKitClassicCar() {
        checkCar(CarProductionRegion.GARAGE, CarType.CLASSIC_CAR);
    }

    @Test
    public void shouldCreateKitSportsCar() {
        checkCar(CarProductionRegion.GARAGE, CarType.SPORTS_CAR);
    }

    @Test
    public void shouldCreateKitTruck() {
        checkCar(CarProductionRegion.GARAGE, CarType.TRUCK);
    }

}