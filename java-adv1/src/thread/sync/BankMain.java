package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
//        BankAccount account = new BankAccountV1(1000);
//        BankAccount account = new BankAccountV2(1000);
        BankAccount account = new BankAccountV3(1000);

        Thread thread1 = new Thread(new WithdrawTask(account, 800), "thread1");
        Thread thread2 = new Thread(new WithdrawTask(account, 800), "thread2");

        thread1.start();
        thread2.start();

        sleep(500); // 검증 완료까지 잠시 대기
        log("thread1 state : " + thread1.getState());
        log("thread2 state : " + thread2.getState());

        thread1.join();
        thread2.join();

        log("최종 잔액 : " + account.getBalance());
    }
}
