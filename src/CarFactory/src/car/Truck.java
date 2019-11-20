package car;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;

public class Truck extends Car {

    public Truck(CarProductionRegion carProductionRegion) {
        super(CarType.TRUCK, carProductionRegion);
    }

    @Override
    public void runTheEngine() {
        System.out.println("khkhtrrttrrrttrumptrklekle");
    }

    @Override
    public void drive() {
        System.out.println("kleklekelkelkelkekelekkeeklklekekeelkelekellekelekekelke");
    }

    public static class Builder extends Car.CarBuilder {

        @Override
        public Car build() {
            Car car = new Truck(carProductionRegion);
            ((Truck) car).carInteriorColor = this.CarInteriorColor;
            ((Truck) car).carBodyColor = this.CarBodyColor;
            return car;
        }
    }
}
