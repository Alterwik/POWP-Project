package decorator;

import car.utilities.Car;

public class ParkingSensors extends CarDecorator {

    public ParkingSensors(Car car) {
        super(car);
        decore("PARKING_SENSORS");
    }

    @Override
    public void runTheEngine() {
        car.runTheEngine();
    }

    @Override
    public void drive() {
        car.drive();
    }
}