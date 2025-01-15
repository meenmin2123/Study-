package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {
    public static void main(String[] args) {
        // 중첩 클래스

        log("main() start");

        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();

        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");

    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("run() start");
        }
    }
}

