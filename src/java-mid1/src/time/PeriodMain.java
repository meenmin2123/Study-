package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {

        // 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030,1,12);
        LocalDate plusDate = currentDate.plus(period);

        System.out.println("현재 날짜 = " + currentDate);
        System.out.println("더한 날짜 = " + plusDate);
    }
}
