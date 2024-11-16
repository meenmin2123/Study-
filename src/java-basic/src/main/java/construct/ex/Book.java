package construct.ex;

public class Book {
    String title;   // 제목
    String author;  // 저자
    int pages;      // 페이지

    public Book() {}

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
