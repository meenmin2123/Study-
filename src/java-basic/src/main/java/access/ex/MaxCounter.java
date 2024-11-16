package access.ex;

public class MaxCounter {
    private int max = 5;
    private int count = 0;

    public MaxCounter() {
    }

    public MaxCounter(int max, int count) {
        this.max = max;
        this.count = count;
    }

    // 증가
    public void increment() {

        // 검증 로직
        if(count > max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}
