public class BookManager {

    // 도서 관리 클래스
    private String bookTitle;
    private int bookCount = 0;

    public void addBook(String title) {
        this.bookTitle = title;
        this.bookCount++;
        System.out.println("Book added: " + title);
    }

    public String getBook() {
        return bookTitle;
    }
    
    public int getBookCount() {
        return bookCount;
    }
    public void removeBook() {
        this.bookTitle = null;
        System.out.println("Book removed");
    }
}