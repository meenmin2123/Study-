package Class1;

public class classStart4 {

    public static void main(String[] args) {

        // 객체 생성
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 77;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 89;

        // 배열 생성
        Student[] students = new Student[2];
        // Student[] students = {student1, student2};
        students[0] = student1;
        students[1] = student2;
        System.out.println("이름 : " + students[0].name + ", 나이 : " + students[0].age + ", 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + ", 나이 : " + students[1].age + ", 성적 : " + students[1].grade);
    }

}
