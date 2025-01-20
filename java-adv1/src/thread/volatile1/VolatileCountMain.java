package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);
        log("flag false로 변경 시도");
        task.flag = false;

        log("flag = " + task.flag + ", count = " + task.count + " in while()");
        log("main 종료");
    }

    static class MyTask implements Runnable {

        // volatile 없을 때
//        boolean flag = true;
//        long count;

        // volatile 있을 때
        volatile boolean flag = true;
        volatile long count;

        @Override
        public void run() {
            log("task 시작");

            while (flag) {
                count++;
                // 1억번에 한번씩 출력
                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + ", count = " + count + " in while()");
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}
