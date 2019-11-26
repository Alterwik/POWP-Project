package tests;


import car.CityCar;
import car.ClassicCar;
import car.SportsCar;
import car.Truck;
import car.utilities.Car;
import car.utilities.CarProductionRegion;
import decorator.DigitalClocks;
import decorator.HeatedSeats;
import decorator.ParkingSensors;
import decorator.Tablets;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CarDecoratorTest {

    @Test
    public void shouldDecorateWithSeatsAndClocks() {
        Car car = new SportsCar(CarProductionRegion.EUROPE);
        car = new DigitalClocks(car);
        car = new HeatedSeats(car);
        String expectedString = "SPORTS_CAR build in EUROPE with DIGITAL_CLOCKS with HEATED_SEATS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithDigitalClocks() {
        Car car = new Truck(CarProductionRegion.JAPAN);
        car = new DigitalClocks(car);
        String expectedString = "TRUCK build in JAPAN with DIGITAL_CLOCKS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithHeatedSeats() {
        Car car = new ClassicCar(CarProductionRegion.USA);
        car = new HeatedSeats(car);
        String expectedString = "CLASSIC_CAR build in USA with HEATED_SEATS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithParkingSensors() {
        Car car = new CityCar(CarProductionRegion.GARAGE);
        car = new ParkingSensors(car);
        String expectedString = "CITY_CAR build in GARAGE with PARKING_SENSORS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithTablets() {
        Car car = new SportsCar(CarProductionRegion.EUROPE);
        car = new Tablets(car);
        String expectedString = "SPORTS_CAR build in EUROPE with TABLETS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithSeatsClocksSensorsAndTablets() {
        Car car = new SportsCar(CarProductionRegion.JAPAN);
        car = new DigitalClocks(car);
        car = new HeatedSeats(car);
        car = new ParkingSensors(car);
        car = new Tablets(car);
        String expectedString = "SPORTS_CAR build in JAPAN" +
                " with DIGITAL_CLOCKS with HEATED_SEATS" +
                " with PARKING_SENSORS with TABLETS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithTabletsOnlyOnce() {
        Car car = new SportsCar(CarProductionRegion.EUROPE);
        car = new Tablets(car);
        car = new Tablets(car);
        String expectedString = "SPORTS_CAR build in EUROPE with TABLETS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithSeatsAndClocksOnlyOnce() {
        Car car = new SportsCar(CarProductionRegion.EUROPE);
        car = new DigitalClocks(car);
        car = new HeatedSeats(car);
        car = new DigitalClocks(car);
        String expectedString = "SPORTS_CAR build in EUROPE with DIGITAL_CLOCKS with HEATED_SEATS";
        Assertions.assertEquals(expectedString, car.toString());
    }

    @Test
    public void shouldDecorateWithSeatsClocksSensorsAndTabletsOnlyOnce() {
        Car car = new SportsCar(CarProductionRegion.JAPAN);
        car = new DigitalClocks(car);
        car = new DigitalClocks(car);
        car = new HeatedSeats(car);
        car = new DigitalClocks(car);
        car = new HeatedSeats(car);
        car = new ParkingSensors(car);
        car = new HeatedSeats(car);
        car = new ParkingSensors(car);
        car = new ParkingSensors(car);
        car = new HeatedSeats(car);
        car = new DigitalClocks(car);
        car = new ParkingSensors(car);
        car = new ParkingSensors(car);
        car = new HeatedSeats(car);
        car = new Tablets(car);
        car = new DigitalClocks(car);
        car = new Tablets(car);
        car = new ParkingSensors(car);
        car = new Tablets(car);
        car = new Tablets(car);
        car = new HeatedSeats(car);
        car = new Tablets(car);
        car = new ParkingSensors(car);
        car = new Tablets(car);
        String expectedString = "SPORTS_CAR build in JAPAN" +
                " with DIGITAL_CLOCKS with HEATED_SEATS" +
                " with PARKING_SENSORS with TABLETS";
        Assertions.assertEquals(expectedString, car.toString());
    }
}
