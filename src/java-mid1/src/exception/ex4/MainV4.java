package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        System.out.println("==MainV1 실행==");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }


            // 예외를 공통으로 처리
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                // 예외된 정보를 받음
                exceptionHandler(e);
            }

            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리 메서드
    private static void exceptionHandler(Exception e) {

        // 공통 처리
        System.out.println("사용자 메시지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("== 개발자용 디버깅 메서지 ==");
        e.printStackTrace(System.out);  // 스택 트레이스 출력
        e.printStackTrace();

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendDate());
        }
    }
}
