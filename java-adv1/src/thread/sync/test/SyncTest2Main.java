package thread.sync.test;

import static util.MyLogger.log;

public class SyncTest2Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                myCounter.count();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }

    static class MyCounter {

        public void count() {

            // 지역 변수 사용으로 동시성에 문제가 발생하지 않음.
            int localValue = 0;
            for (int i = 0; i < 100_000_000; i++) {
                localValue++;
            }
            log("결과 : " + localValue);
        }

    }
}
