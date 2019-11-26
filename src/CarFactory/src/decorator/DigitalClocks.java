package decorator;

import car.utilities.Car;
import decorator.utilities.CarDecoration;

public class DigitalClocks extends CarDecorator {

    public DigitalClocks(Car car) {
        super(car);
        decorate(CarDecoration.DIGITAL_CLOCKS);
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
