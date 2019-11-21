package decorator;

import car.utilities.Car;

abstract class CarDecorator implements CarDecoratorInterface {
    private CarDecoratorInterface core;

    public CarDecorator(CarDecoratorInterface inner) {
        core = inner;
    }

    public void decorateCar(Car carToDecorate) {
        core.decorateCar(carToDecorate);
    }
}
