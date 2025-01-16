package thread.controle;

import util.ThreadUtils;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }

    static class CheckedRunnable implements Runnable {

        @Override
        public void run() {
            ThreadUtils.sleep(10);
        }

        // 예외 오류 발생
//        @Override
//        public void run() throws Exception {
//            throw new Exception();
//        }
    }
}
