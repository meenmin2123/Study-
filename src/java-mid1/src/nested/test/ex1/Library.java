package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        System.out.println("bookCount: " + bookCount);
        System.out.println("books.length: " + books.length);

        // 검증 로직
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        // 정상 로직 처리
        books[bookCount++] = new Book(title, author);

    }

    public void showBooks() {
        System.out.println("=== 책 목록 출력 ===");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서 제목 : " + books[i].getTitle() + ", 저자 : " + books[i].getAuthor());
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

    }
}
