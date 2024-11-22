package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] parts = email.split("@");
        String idPart = parts[0];
        String name = parts[1];

        for (String part : parts) {
            System.out.println(part);
        }
        System.out.println("idPart = " + idPart);
        System.out.println("name = " + name);
    }
}
