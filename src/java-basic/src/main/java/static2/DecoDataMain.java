package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2-1. 인스턴스 호출1");
        DecoData decodata1 = new DecoData();
        decodata1.instanceCall();

        System.out.println("2-2. 인스턴스 호출2");
        DecoData decodata2 = new DecoData();
        decodata2.instanceCall();

        // 추가
        System.out.println("3. 추가 호출");

        // 인스턴스를 통한 접근
        DecoData decodata3 = new DecoData();
        decodata3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
