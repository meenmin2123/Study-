package Class1;

public class classStart5 {

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
        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            System.out.println("이름 : " + students[i].name + ", 나이 : " + students[i].age + ", 성적 : " + students[i].grade);
        }

    }

}
