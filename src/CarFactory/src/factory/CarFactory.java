package factory;

import car.utilities.Car;
import car.utilities.CarProductionRegion;
import car.utilities.CarType;

public class CarFactory {

    private CarProductionRegion carProductionRegion = null;

    public Car create(CarType carType) {
        Car car = null;

        switch(carProductionRegion)
        {
            case USA:
                car = UsaCarFactory.create(carType);
                break;
            case EUROPE:
                car = EuropeCarFactory.create(carType);
                break;
            case JAPAN:
                car = JapanCarFactory.create(carType);
                break;
            default:
                car = KitCarGarageFactory.create(carType);
        }
        return car;
    }

    public CarProductionRegion getCarProductionRegion() {
        return carProductionRegion;
    }

    public void setCarProductionRegion(CarProductionRegion carProductionRegion) {
        this.carProductionRegion = carProductionRegion;
    }
}
