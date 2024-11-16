package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct m1 = new MemberConstruct("user1",15,90);
        MemberConstruct m2 = new MemberConstruct("user2",16);

        MemberConstruct[] members = {m1,m2};

        for (MemberConstruct m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 성적 : " + m.grade );
        }
    }
}
