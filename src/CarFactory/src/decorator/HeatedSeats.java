package decorator;

import decorator.utilities.CarDecoratorInterface;

public class HeatedSeats extends CarDecorator {
    public HeatedSeats(CarDecoratorInterface inner) {
        super(inner);
    }

    @Override
    public void decorateCar() {
        super.decorateCar();
        System.out.print(" HEATED SEATS");
    }
}
