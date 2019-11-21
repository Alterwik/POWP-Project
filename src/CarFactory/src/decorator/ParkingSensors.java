package decorator;

import car.utilities.Car;

public class ParkingSensors extends CarDecorator {
    public ParkingSensors(CarDecoratorInterface inner) {
        super(inner);
    }

    @Override
    public void decorateCar() {
        super.decorateCar();
        System.out.print(" PARKING SENSORS");
    }
}