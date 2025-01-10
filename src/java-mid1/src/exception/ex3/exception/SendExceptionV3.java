package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendDate;


    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendDate = sendData;
    }

    public String getSendDate() {
        return sendDate;
    }
}
