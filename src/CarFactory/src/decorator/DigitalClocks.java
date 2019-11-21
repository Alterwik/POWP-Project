package decorator;

import car.utilities.Car;

public class DigitalClocks extends CarDecorator {

    public DigitalClocks(CarDecoratorInterface inner){
        super(inner);
    }

    @Override
    public void decorateCar(Car carToDecorate) {
        carToDecorate.addCarDecoration("DIGITAL CLOCKS");
    }
}
