package pubsub;

import java.util.*;

public class PubSubService {
    Map<String, Set<Subscriber>> subscribersMap = new HashMap<String, Set<Subscriber>>();

    public void manageMessage(Message message){
        Set<Subscriber> subscribers = subscribersMap.get(message.getClientName());
        try {
            for (Subscriber s : subscribers) {
                s.printMessages(message);
            }
        } catch (NullPointerException e){
        }
    }

    public void addSubscriber(String clientName, Subscriber subscriber){
        if(subscribersMap.containsKey(clientName)){
            Set<Subscriber> subscribers = subscribersMap.get(clientName);
            subscribers.add(subscriber);
            subscribersMap.put(clientName, subscribers);
        }else{
            Set<Subscriber> subscribers = new HashSet<Subscriber>();
            subscribers.add(subscriber);
            subscribersMap.put(clientName, subscribers);
        }
    }

    public void removeSubscriber(String clientName, Subscriber subscriber){
        if(subscribersMap.containsKey(clientName)){
            Set<Subscriber> subscribers = subscribersMap.get(clientName);
            subscribers.remove(subscriber);
            subscribersMap.put(clientName, subscribers);
        }
    }
}