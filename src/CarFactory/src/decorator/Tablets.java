package decorator;

import car.utilities.Car;

public class Tablets extends CarDecorator {
    public Tablets(CarDecoratorInterface inner){
        super(inner);
    }

    @Override
    public void decorateCar() {
        super.decorateCar();
        System.out.print(" TABLETS");
    }
}
