package exception.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendDate;


    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendDate = sendData;
    }

    public String getSendDate() {
        return sendDate;
    }
}
