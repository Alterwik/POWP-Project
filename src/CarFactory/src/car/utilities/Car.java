package car.utilities;

public abstract class Car implements Driveable {
    protected CarType carType;
    protected CarProductionRegion carProductionRegion;

    protected Car(CarType carType, CarProductionRegion carProductionRegion) {
        this.carProductionRegion = carProductionRegion;
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public CarProductionRegion getCarProductionRegion() {
        return carProductionRegion;
    }

    public String toString() {
        return carType + " built in " + carProductionRegion;
    }

}
