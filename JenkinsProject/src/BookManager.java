public class BookManager {
    
    // 도서 관리 클래스
    private String bookTitle;
    
    public void addBook(String title) {
        this.bookTitle = title;
        System.out.println("Book added: " + title);
    }
    
    public String getBook() {
        return bookTitle;
    }
}