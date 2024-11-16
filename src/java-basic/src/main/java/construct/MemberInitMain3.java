package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 20, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 21, 95);

        MemberInit[] members = new MemberInit[2];
        members[0] = member1;
        members[1] = member2;

        for (MemberInit m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적 : " + m.grade );
        }
    }
}
