package nested.inner;

public class InnerOuter {
    private static int outClassValue = 1500;
    private int outInstanceValue = 2000;

    class Inner {
        private int innerInstanceValue = 2000;

        public void print() {

            // 자신의 멤버에 접근
            System.out.println("innerInstanceValue = " + innerInstanceValue);

            // 외부 클래스의 인스턴스 멤버에 접근 가능, privat도 접근 가능
            System.out.println("outInstanceValue = " + outInstanceValue);

            // 외부 클래스의 클래스 멤버에 접근 가능, private도 접근 가능
            System.out.println("InnerOuter = " + InnerOuter.outClassValue);
        }
    }
}
