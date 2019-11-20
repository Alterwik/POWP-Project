package car;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;

public class SportsCar extends Car {

    public SportsCar(CarProductionRegion carProductionRegion) {
        super(CarType.SPORTS_CAR, carProductionRegion);
    }

    @Override
    public void runTheEngine() {
        System.out.println("RumpumPumpumPamPamPim!!!");
    }

    @Override
    public void drive() {
        System.out.println("RRRRRRrrrrrrr...WRRrrrrrrrrrrrr...Wrrrrrrrrrrrrrrrrrrrr");
    }

    public static class Builder extends Car.CarBuilder {

        @Override
        public Car build() {
            Car car = new SportsCar(carProductionRegion);
            ((SportsCar) car).carInteriorColor = this.CarInteriorColor;
            ((SportsCar) car).carBodyColor = this.CarBodyColor;
            return car;
        }
    }
}
