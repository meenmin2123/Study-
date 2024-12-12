package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,20,25);
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("ldt = " + ldt);
        System.out.println("zdt = " + zdt);

        LocalDateTime ldt1 = LocalDateTime.of(2030, 1, 1, 20, 13, 20, 20);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, ZoneId.of("Asia/Seoul"));
        System.out.println("ldt1 = " + ldt1);
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 20, 13, 20, 20, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt);
    }
}
