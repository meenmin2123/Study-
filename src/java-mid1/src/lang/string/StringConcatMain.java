package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello";
        String b = "world";

        String reuslt1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + reuslt1);
        System.out.println("result2 = " + result2);

    }
}
