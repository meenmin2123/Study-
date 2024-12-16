package exception.basic.checked;

// Exception을 상속받는 예외는 체크 예외가 됨.
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}
