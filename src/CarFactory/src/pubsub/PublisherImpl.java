package pubsub;

public class PublisherImpl implements Publisher {
    public void publish(Message message, PubSubService pubSubService) {
        pubSubService.manageMessage(message);
    }
}