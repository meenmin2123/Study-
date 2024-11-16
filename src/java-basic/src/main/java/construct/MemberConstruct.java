package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    public MemberConstruct() {
    }

    public MemberConstruct(String name, int age) {
        this(name, age, 50);
//        System.out.println("생성자 호출 // name:" + name + ", age:" + age);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 // name:" + name + ", age:" + age + ", grade:" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
