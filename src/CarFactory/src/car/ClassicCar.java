package car;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;

public class ClassicCar extends Car {

    public ClassicCar(CarProductionRegion carProductionRegion) {
        super(CarType.CLASSIC_CAR, carProductionRegion);
    }

    @Override
    public void runTheEngine() {
        System.out.println("wroom wroom");
    }

    @Override
    public void drive() {
        System.out.println("klep klep");
    }

    public static class Builder extends Car.CarBuilder {

        @Override
        public Car build() {
            ClassicCar car = new ClassicCar(carProductionRegion);
            car.carInteriorColor = this.CarInteriorColor;
            car.carBodyColor = this.CarBodyColor;
            return car;
        }
    }
}
