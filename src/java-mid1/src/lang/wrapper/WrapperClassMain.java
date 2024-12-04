package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        Integer newInteger = new Integer(10);
        Integer integerObj = Integer.valueOf(10);
        Long newLong = Long.valueOf(10);
        Float newFloat = Float.valueOf(10);
        Double newDouble = Double.valueOf(10);

        System.out.println("newInteger : " + newInteger);
        System.out.println("integerObj : " + integerObj);
        System.out.println("newLong : " + newLong);
        System.out.println("newFloat : " + newFloat);
        System.out.println("newDouble : " + newDouble);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue : " + intValue);

        long longValue = newLong.intValue();
        System.out.println("longValue : " + longValue);

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals: " + newInteger.equals(integerObj));
    }
}
