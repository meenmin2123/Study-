package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {

        InterfaceA a = new Child();
        System.out.println("InterfaceA 실행!");
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        System.out.println("InterfaceB 실행!");
        b.methodB();
        b.methodCommon();
    }
}
