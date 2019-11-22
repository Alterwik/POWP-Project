package decorator;

import decorator.utilities.CarDecoratorInterface;

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
