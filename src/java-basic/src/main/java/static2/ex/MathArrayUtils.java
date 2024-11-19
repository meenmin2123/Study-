package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {}     // 인스턴스 생성을 막음.

    public static int sum(int[] values) {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) (sum(values) / values.length);
    }

    public static int min(int[] values) {

        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
        return minValue;
    }

    public static int max(int[] values) {

        int maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
