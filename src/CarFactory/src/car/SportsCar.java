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
}
