package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        while (true) {
            System.out.println("당신의 등급을 입력 하세요.");
            System.out.println("1. GUEST");
            System.out.println("2. LOGIN");
            System.out.println("3. ADMIN");
            System.out.println(">");
            int choice = scan.nextInt();

            System.out.println("==메뉴 목록==");
            if (choice == 1) {
                System.out.println("- 메인 화면");
                break;
            } else if (choice == 2) {
                System.out.println("- 이메일 관리 화면");
                break;
            } else if (choice == 3) {
                System.out.println("- 관리자 화면");
                break;
            }

            if (choice != 1 && choice != 2 && choice != 3) {
                System.out.println("다시 입력해주세요.");
                continue;
            }
        }

    }
}
