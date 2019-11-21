package pubsub;

public class SubscriberImpl extends Subscriber{
    public void addSubscriber(String clientName, PubSubService pubSubService){
        pubSubService.addSubscriber(clientName, this);
    }

    public void unSubscribe(String clientName, PubSubService pubSubService){
        pubSubService.removeSubscriber(clientName, this);
    }
}