package decorator;

import car.utilities.Car;

public class DigitalClocks extends CarDecorator {

    public DigitalClocks(Car car) {
        super(car);
        decore("DIGITAL_CLOCKS");
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
