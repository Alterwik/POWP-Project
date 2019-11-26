package decorator;

import car.utilities.Car;
import decorator.utilities.CarDecoration;

import java.util.EnumSet;

abstract class CarDecorator extends Car {
    protected Car car;
    protected EnumSet<CarDecoration> decorations = EnumSet.noneOf(CarDecoration.class);

    protected CarDecorator(Car car) {
        super(car.getCarType(), car.getCarProductionRegion());
        this.car = car;
    }

    protected void decorate(CarDecoration decoration) {
        decorations.add(decoration);
    }

    @Override
    public String toString(){
        String output = car.toString();
        String addition = " with " + decorations.toString()
                .replace("[", "")
                .replace("]", "");
        if(!output.contains(addition)){
            output += addition;
        }
        return output;
    }

}
