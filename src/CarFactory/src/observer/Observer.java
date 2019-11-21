package observer;

import factory.CarFactory;

abstract class Observer {
    protected CarFactory carFactory;
    public abstract void update();
}
