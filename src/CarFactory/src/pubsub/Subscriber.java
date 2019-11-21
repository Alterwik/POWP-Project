package pubsub;

public abstract class Subscriber {
    public abstract void addSubscriber(String clientName, PubSubService pubSubService);

    public abstract void unSubscribe(String clientName, PubSubService pubSubService);

    public void printMessages(Message message){
        System.out.println(message);
    }
}