package nested.nested.ex2;

public class Network {

    public void sendMessage(String message){
        NetworkMessage msg = new NetworkMessage(message);
        msg.print();
    }

    private static class NetworkMessage {
        private String content;
        public NetworkMessage(String content) {
            this.content = content;
        }
        public void print() {
            System.out.println("ex2 - content: " + content);
        }
    }
}
