package nested.nested;

public class NestedOuter {

    private static int outClassValue = 300;
    private int outInnerClassValue = 250;

    static class Nested {
        private int nestedInnerClassValue = 100;

        public void print() {
            System.out.println("print 실행");
             // 자신의 멤버에 접근
            System.out.println(nestedInnerClassValue);

            // 바깥 클래스의 인스턴 스 멤버에 접근할 수 없음.
//            System.out.println(outInnerClassValue);

            // 바깥 클래스의 클래스 멤버에 접근할 수 있음
            System.out.println(outClassValue);
        }

    }
}
