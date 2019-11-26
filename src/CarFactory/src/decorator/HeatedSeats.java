package decorator;

import car.utilities.Car;

public class HeatedSeats extends CarDecorator {

    public HeatedSeats(Car car) {
        super(car);
        decore("HEATED_SEATS");
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
