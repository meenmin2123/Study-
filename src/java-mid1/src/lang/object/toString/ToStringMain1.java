package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String str = obj.toString();

        System.out.println("String : " + str);
        System.out.println("Object : " + obj);
    }
}
