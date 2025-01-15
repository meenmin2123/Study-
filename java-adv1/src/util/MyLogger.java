package util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {

    // formatting
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(Object obj) {
        String time = LocalTime.now().format(formatter);
        // 문자열로 9칸으로 출력될 수 있게
        System.out.printf("%s [%9s] %s\n", time + "s", Thread.currentThread().getName(), obj);
    }

}
