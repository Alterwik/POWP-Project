package observer;

public class ProductionEndedObserver extends Observer {
    public ProductionEndedObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    public void update() {
        System.out.println("OBSERVER: ".concat(subject.getState()));
    }
}