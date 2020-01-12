package car;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;

public class CityCar extends Car {

    public CityCar(CarProductionRegion carProductionRegion) {
        super(CarType.CITY_CAR, carProductionRegion);
    }

    @Override
    public void runTheEngine() {
        System.out.println("bzym bzoom");
    }

    @Override
    public void drive() {
        System.out.println("bzzzz prrrrr");
    }

    public static class Builder extends Car.CarBuilder {

        @Override
        public Car build() {
            CityCar car = new CityCar(carProductionRegion);
            car.carInteriorColor = this.CarInteriorColor;
            car.carBodyColor = this.CarBodyColor;
            return car;
        }
    }
}
