package pubsub;

public class Message {
    private String clientName;
    private String payload;

    public Message(){}
    public Message(String clientName, String payload) {
        this.clientName = clientName;
        this.payload = payload;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public String toString(){
        return "Message " + this.getClientName() + " -> " + this.getPayload();
    }
}
