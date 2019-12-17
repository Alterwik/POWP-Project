package singleton;

import car.utilities.Car;
import factory.CarFactory;

import java.util.ArrayList;
import java.util.List;

public class CarList {

    private CarList() {}

    private static CarList single_instance = null;

    public CarFactory carFactory = new CarFactory();
    private List<Car> carList = new ArrayList();

    public static CarList getInstance() {
        if (single_instance == null) single_instance = new CarList();
        return single_instance;
    }

    public void addCar(Car car){
        carList.add(car);
    }

    public void addDecorationToLastCar(Car car){
        carList.set(carList.size() - 1, car);
    }

    public Car getLastCar(){
        return carList.get(carList.size() - 1);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
