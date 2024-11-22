package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {

        ValueAdder adder = new ValueAdder();

        // 메서드 체인 기법
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
