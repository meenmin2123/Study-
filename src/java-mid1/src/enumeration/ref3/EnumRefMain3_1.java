package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic + "원");
        System.out.println("GOLD 등급의 할인 금액: " + gold + "원");
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond + "원");
    }
}
