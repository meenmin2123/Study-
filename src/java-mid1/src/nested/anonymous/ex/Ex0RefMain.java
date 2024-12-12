package nested.anonymous.ex;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로젝트 시작");
        System.out.println(str);
        System.out.println("프로젝트 종료!");
    }

    public static void main(String[] args) {
        hello("hello Java!");
        hello("hello Spring!");
    }
}
