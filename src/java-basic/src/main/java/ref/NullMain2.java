package ref;

public class NullMain2 {
    public static void main(String[] args) {
        
        Data data = null;
        // data.value = 10;    // nullPointerException 예외 발생
        System.out.println("1. Data = " + data.value);
    }
}
