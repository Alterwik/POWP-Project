package decorator;

import car.utilities.Car;

public class HeatedSeats implements CarDecoratorInterface {

    @Override
    public void decorateCar(Car carToDecorate) {
        carToDecorate.addCarDecoration("HEATED SEATS");
    }
}
