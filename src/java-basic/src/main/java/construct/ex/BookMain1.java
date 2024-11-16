package construct.ex;

public class BookMain1 {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Book("자바의 정석", "남궁성", 1212);
        books[1] = new Book("이것이 자바다", "신용권", 900);
        books[2] = new Book("Do it! 자바 프로그래밍", "박은종", 500);
        books[3] = new Book("코딩의 신", "천인국", 324);
        books[4] = new Book("모던 자바 인 액션", "라울-게이브리얼 우르마", 624);
        books[5] = new Book("스프링 부트와 AWS로 혼자 구현하는 웹 서비스", "이동욱", 528);
        books[6] = new Book("객체지향의 사실과 오해", "조영호", 264);
        books[7] = new Book("IT 개발자가 알아야 할 97가지", "정호영", 384);
        books[8] = new Book("쉽게 배우는 알고리즘", "이광조", 320);
        books[9] = new Book("Clean Code 클린 코드 한국어판", "로버트 C. 마틴", 552);

        // 배열에 저장된 데이터를 출력
        for (Book book : books) {
            System.out.println("제목: " + book.title + ", 저자: " + book.author + ", 페이지: " + book.pages);
        }

    }
}
