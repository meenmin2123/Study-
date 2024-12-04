package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder rev = new StringBuilder(str).reverse();
        System.out.println("rev = " + rev);

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("reversed: " +reversed);
    }
}