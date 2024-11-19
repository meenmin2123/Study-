package final1.ex;

public class Member {

    private final String id;    // final 사용
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name) {
        this.name = name;
        //this.id = id;   // 컴파일 오류 발생
    }

    public void print() {
        System.out.println("id : " + id + " name : " + name);
    }
}
