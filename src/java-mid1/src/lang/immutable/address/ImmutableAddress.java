package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public String getValue() {
        return value;
    }

    // final로 선언하여 변경할 수 없음
//    public void setValue(String value) {
//        this.value = value;
//    }

    public ImmutableAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
