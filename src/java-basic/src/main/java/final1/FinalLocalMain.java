package final1;

// final 지역 변수에서 사용 예제
public class FinalLocalMain {

    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10;     // 최초 한번만 할당 가능
//        data1 = 20;   // 컴파일 오류

        // final 지역 변수2
        final int data2 = 15;
    }

    static void method(final int parameter) {
//        parameter = 20;   // 컴파일 오류

    }
}
