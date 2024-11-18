package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    private void instanceMethod() {
        System.out.println("instanceMethod");
    }

    private static void staticMethod() {
        System.out.println("staticMethod");
    }

    public static void staticCall() {
        staticValue++;  // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticMethod();
        staticCall();

    }
}
