package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myID","choi");
        member.print();

        member.changeData("CHOI");
        member.print();
    }
}
