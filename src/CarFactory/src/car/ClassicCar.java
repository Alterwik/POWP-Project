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
            Car car = new ClassicCar(carProductionRegion);
            ((ClassicCar) car).carInteriorColor = this.CarInteriorColor;
            ((ClassicCar) car).carBodyColor = this.CarBodyColor;
            return car;
        }
    }
}
