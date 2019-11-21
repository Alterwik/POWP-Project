package decorator;

import car.utilities.Car;

public class ParkingSensors extends CarDecorator {
    public ParkingSensors(CarDecoratorInterface inner) {
        super(inner);
    }

    @Override
    public void decorateCar(Car carToDecorate) {
        carToDecorate.addCarDecoration("PARKING SENSORS");
    }
}