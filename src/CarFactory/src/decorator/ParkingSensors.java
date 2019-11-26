package decorator;

import car.utilities.Car;
import decorator.utilities.CarDecoration;

public class ParkingSensors extends CarDecorator {

    public ParkingSensors(Car car) {
        super(car);
        decorate(CarDecoration.PARKING_SENSORS);
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