package factory;

import car.Car;
import car.CarType;

public class SportsCarFactory implements AbstractFactory<Car> {

    @Override
    public Car create(CarType carType) {
        return null;
    }
}
