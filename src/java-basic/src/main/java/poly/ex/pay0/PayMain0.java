package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {

        PayService service = new PayService();

        // kakao
        String payOption1 = "kakao";
        int amount1 = 5000;
        service.processPay(payOption1, amount1);

        // naver
        String payOption2 = "naver";
        int amount2 = 15000;
        service.processPay(payOption2, amount2);

        // 잘못된 결제 수단 선택
        String payOption3 = "wrongOption";
        int amount3 = 0;
        service.processPay(payOption3, amount3);

    }
}
