package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + " : main() start");

        // run()가 아니라 start()를 반드시 호출해야 함.
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");
        HelloThread thread = new HelloThread();
        thread.start();
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");

        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
