package decorator;

import car.utilities.Car;

public class Tablets extends CarDecorator {

    public Tablets(Car car) {
        super(car);
        decore("TABLETS");
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
