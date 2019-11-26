package decorator;

import car.utilities.Car;
import decorator.utilities.CarDecoration;

public class Tablets extends CarDecorator {

    public Tablets(Car car) {
        super(car);
        decorate(CarDecoration.TABLETS);
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
