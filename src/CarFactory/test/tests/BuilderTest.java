package tests;

import car.CityCar;
import car.ClassicCar;
import car.SportsCar;
import car.Truck;
import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BuilderTest {

    @Test
    public void shouldCreateTruckUsingBuilder() {
        final String EXPECTED_BODY_COLOUR = "#667788";
        final String EXPECTED_INTERIOR_COLOR = "#334455";
        Car car = new Truck.Builder()
                .carProductionRegion(CarProductionRegion.GARAGE)
                .carBodyColor(EXPECTED_BODY_COLOUR)
                .carInteriorColor(EXPECTED_INTERIOR_COLOR)
                .carType(CarType.SPORTS_CAR)
                .build();
        Assertions.assertSame(CarProductionRegion.GARAGE, car.getCarProductionRegion());
        Assertions.assertSame(CarType.TRUCK, car.getCarType());
        Assertions.assertEquals(EXPECTED_BODY_COLOUR, car.getCarBodyColor());
        Assertions.assertEquals(EXPECTED_INTERIOR_COLOR, car.getCarInteriorColor());
    }

    @Test
    public void shouldCreateSportsCarUsingBuilder() {
        final String EXPECTED_BODY_COLOUR = "#AA0000";
        final String EXPECTED_INTERIOR_COLOR = "#CCCCCC";
        Car car = new SportsCar.Builder()
                .carProductionRegion(CarProductionRegion.JAPAN)
                .carType(CarType.TRUCK)
                .carBodyColor(EXPECTED_BODY_COLOUR)
                .carInteriorColor(EXPECTED_INTERIOR_COLOR)
                .build();
        Assertions.assertSame(CarProductionRegion.JAPAN, car.getCarProductionRegion());
        Assertions.assertSame(CarType.SPORTS_CAR, car.getCarType());
        Assertions.assertEquals(EXPECTED_BODY_COLOUR, car.getCarBodyColor());
        Assertions.assertEquals(EXPECTED_INTERIOR_COLOR, car.getCarInteriorColor());
    }

    @Test
    public void shouldCreateClassicCarUsingBuilder() {
        final String EXPECTED_BODY_COLOUR = "#000000";
        final String EXPECTED_INTERIOR_COLOR = "#DDCCCC";
        Car car = new ClassicCar.Builder()
                .carProductionRegion(CarProductionRegion.USA)
                .carType(CarType.TRUCK)
                .carBodyColor(EXPECTED_BODY_COLOUR)
                .carInteriorColor(EXPECTED_INTERIOR_COLOR)
                .build();
        Assertions.assertSame(CarProductionRegion.USA, car.getCarProductionRegion());
        Assertions.assertSame(CarType.CLASSIC_CAR, car.getCarType());
        Assertions.assertEquals(EXPECTED_BODY_COLOUR, car.getCarBodyColor());
        Assertions.assertEquals(EXPECTED_INTERIOR_COLOR, car.getCarInteriorColor());
    }

    @Test
    public void shouldCreateCityCarUsingBuilder() {
        final String EXPECTED_BODY_COLOUR = "#AABBDD";
        final String EXPECTED_INTERIOR_COLOR = "#CCDDCC";
        Car car = new CityCar.Builder()
                .carProductionRegion(CarProductionRegion.EUROPE)
                .carType(CarType.TRUCK)
                .carBodyColor(EXPECTED_BODY_COLOUR)
                .carInteriorColor(EXPECTED_INTERIOR_COLOR)
                .build();
        Assertions.assertSame(CarProductionRegion.EUROPE, car.getCarProductionRegion());
        Assertions.assertSame(CarType.CITY_CAR, car.getCarType());
        Assertions.assertEquals(EXPECTED_BODY_COLOUR, car.getCarBodyColor());
        Assertions.assertEquals(EXPECTED_INTERIOR_COLOR, car.getCarInteriorColor());
    }
}