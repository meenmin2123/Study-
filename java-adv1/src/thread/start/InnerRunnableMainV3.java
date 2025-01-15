
package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        // 중첩 클래스
        log("main() start");

        // 람다식으로 표현
        Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }
}

