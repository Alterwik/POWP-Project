package factory;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;
import factory.utilities.CarCreator;

public class UsaCarFactory extends CarCreator{

    public static Car create(CarType carType) {
        CarProductionRegion cpr = CarProductionRegion.USA;
        return CarCreator.createCar(cpr, carType);
    }
}
