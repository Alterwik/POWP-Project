package decorator;

import car.utilities.Car;

public class Tablets extends CarDecorator {
    public Tablets(CarDecoratorInterface inner){
        super(inner);
    }

    @Override
    public void decorateCar(Car carToDecorate) {
        carToDecorate.addCarDecoration("TABLETS");
    }
}
