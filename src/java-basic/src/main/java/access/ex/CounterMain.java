package access.ex;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();

        int count = maxCounter.getCount();
        System.out.println("count : " + count);



    }
}
