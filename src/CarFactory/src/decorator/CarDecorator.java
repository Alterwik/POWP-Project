package decorator;

abstract class CarDecorator implements CarDecoratorInterface {
    private CarDecoratorInterface core;

    public CarDecorator(CarDecoratorInterface inner) {
        core = inner;
    }

    public void decorateCar() {
        core.decorateCar();
    }
}
