package ref;

public class MethodChange1 {

    public static int changePrimitive(int x) {
        x= 20;
        return x;
    }

    public static void main(String[] args) {
        int a = 10;

        System.out.println("메서드 호출 전 : a = " + a);

        int res = changePrimitive(a);
        System.out.println("메서드 호출 후 : res = " + res);
    }
}
