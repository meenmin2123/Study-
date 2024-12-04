
package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {

        // primitive -> wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(auto-unboxing)

        System.out.println("boxedValue : " + boxedValue);
        System.out.println("unboxedValue : " + unboxedValue);



    }
}
