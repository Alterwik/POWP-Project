package factory.utilities;

import car.CityCar;
import car.ClassicCar;
import car.SportsCar;
import car.Truck;
import car.exceptions.CarTypeNotFoundException;
import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;

public class CarCreator {
    protected static Car createCar(CarProductionRegion carProductionRegion, CarType carType) {
        Car car;
        switch (carType) {
            case SPORTS_CAR:
                car = new SportsCar(carProductionRegion);
                break;
            case TRUCK:
                car = new Truck(carProductionRegion);
                break;
            case CLASSIC_CAR:
                car = new ClassicCar(carProductionRegion);
                break;
            case CITY_CAR:
                car = new CityCar(carProductionRegion);
                break;
            default:
                throw new CarTypeNotFoundException("Incorrect car type : " + carType);
        }
        return car;
    }
}
