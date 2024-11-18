package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        System.out.println("--DecoMain2--");

        String s = "hello java!";
//        String deco = decoUtil1.deco(s);

        System.out.println("Before : " + s);
        System.out.println("After : " + DecoUtil2.deco2(s));

    }
}
