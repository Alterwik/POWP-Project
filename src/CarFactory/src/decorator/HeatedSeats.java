package decorator;

import car.utilities.Car;
import decorator.utilities.CarDecoration;

public class HeatedSeats extends CarDecorator {

    public HeatedSeats(Car car) {
        super(car);
        decorate(CarDecoration.HEATED_SEATS);
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
