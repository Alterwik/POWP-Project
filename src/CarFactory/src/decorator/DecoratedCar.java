package decorator;

import car.utilities.Car;

public class DecoratedCar implements CarDecoratorInterface {
    private Car car;

    public DecoratedCar(Car carToDecorate){
        car = carToDecorate;
    }

    @Override
    public void decorateCar() {
        System.out.print(car);
    }
}
