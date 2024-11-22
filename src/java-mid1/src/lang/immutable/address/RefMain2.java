package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        // 참조형 변수는 하나의 인스턴스를 공유할 수 있음.
        ImmutableAddress a = new ImmutableAddress("서울");

        // 참조값 대입을 막을 수 있는 방법은 없음.
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

//        b.setValue("부산");     // setValue 없어서 실행 안됨.
        System.out.println("부산 -> b");
        System.out.println("a = " + a); //사이드 이펙트 발생
        System.out.println("b = " + b);
    }
}
