package decorator.utilities;

import car.utilities.Car;

import java.util.Set;
import java.util.TreeSet;

public class DecoratedCar implements CarDecoratorInterface {

    private Car car;
    private Set<String> decorations = new TreeSet<>(); //TODO decorations should be added to this set


    public DecoratedCar(Car carToDecorate){
        car = carToDecorate;
    }

    @Override
    public void decorateCar() {
        System.out.print(car);
    }
}
