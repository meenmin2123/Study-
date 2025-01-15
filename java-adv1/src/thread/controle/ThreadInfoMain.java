package thread.controle;

import thread.start.HelloRunnable;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {

        // main 스레드
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.threadId() =" + mainThread.threadId()); // 자동으로 자바가 만드는 id
        log("mainThread.getName() =" + mainThread.getName());
        log("mainThread.getPriority() =" + mainThread.getPriority());      // 우선 선위
        log("mainThread.getThreadGroup() =" + mainThread.getThreadGroup());
        log("mainThread.getState() = " + mainThread.getState());

        // myThread 스레드
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("mainThread = " + myThread);
        log("mainThread.threadId() =" + myThread.getName());
        log("mainThread.getName() =" + myThread.getName());
        log("mainThread.getPriority() =" + myThread.getPriority());
        log("mainThread.getThreadGroup() =" + myThread.getThreadGroup());
        log("mainThread.getState() = " + myThread.getState());
    }
}
