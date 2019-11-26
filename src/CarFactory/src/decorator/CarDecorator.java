package decorator;

import car.utilities.Car;

import java.util.Set;
import java.util.TreeSet;

abstract class CarDecorator extends Car {
    protected Car car;
    protected Set<String> decorations = new TreeSet<>();

    protected CarDecorator(Car car) {
        super(car.getCarType(), car.getCarProductionRegion());
        this.car = car;
    }

    protected void decore(String decoration) {
        decorations.add(decoration);
    }

    @Override
    public String toString(){
        return car.toString() + " with " + decorations.toString()
                .replace("[", "")
                .replace("]", "");
    }

}
