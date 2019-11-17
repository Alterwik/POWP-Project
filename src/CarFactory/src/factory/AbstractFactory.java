package factory;

import car.CarType;

public interface AbstractFactory<T> {
    T create(CarType carType);
}
