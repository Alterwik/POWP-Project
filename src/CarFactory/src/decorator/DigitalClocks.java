package decorator;

import decorator.utilities.CarDecoratorInterface;

public class DigitalClocks extends CarDecorator {

    public DigitalClocks(CarDecoratorInterface inner){
        super(inner);
    }

    @Override
    public void decorateCar() {
        super.decorateCar();
        System.out.print(" DIGITAL CLOCKS");
    }
}
