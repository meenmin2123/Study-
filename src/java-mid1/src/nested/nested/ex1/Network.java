package nested.nested.ex1;

public class Network {

    public void sendMessage(String message){
        NetworkMessage msg = new NetworkMessage(message);
        msg.print();
    }
}
