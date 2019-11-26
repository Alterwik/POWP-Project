package car.utilities;

public abstract class Car implements Driveable {
    protected CarType carType;
    protected CarProductionRegion carProductionRegion;
    protected String carBodyColor;
    protected String carInteriorColor;

    protected Car(CarType carType, CarProductionRegion carProductionRegion) {
        this.carProductionRegion = carProductionRegion;
        this.carType = carType;
        this.carBodyColor = "";
        this.carInteriorColor = "";
    }

    public CarType getCarType() {
        return carType;
    }

    public CarProductionRegion getCarProductionRegion() {
        return carProductionRegion;
    }

    public String getCarBodyColor() {
        return carBodyColor;
    }

    public String getCarInteriorColor() {
        return carInteriorColor;
    }

    public String toString() {
        return carType + " build in " + carProductionRegion;
    }

    public abstract static class CarBuilder {
        protected CarType carType;
        protected CarProductionRegion carProductionRegion;
        protected String CarBodyColor;
        protected String CarInteriorColor;

        protected CarBuilder() {
        }

        public CarBuilder carType(CarType carType) {
            this.carType = carType;
            return this;
        }

        public CarBuilder carProductionRegion(CarProductionRegion carProductionRegion) {
            this.carProductionRegion = carProductionRegion;
            return this;
        }

        public CarBuilder carBodyColor(String CarBodyColor) {
            this.CarBodyColor = CarBodyColor;
            return this;
        }

        public CarBuilder carInteriorColor(String CarInteriorColor) {
            this.CarInteriorColor = CarInteriorColor;
            return this;
        }

        public abstract Car build();
    }
}
