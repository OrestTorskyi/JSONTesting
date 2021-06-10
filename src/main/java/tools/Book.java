package tools;

public class Book {

    private String author;
    private String bookTitle;

    public Book() {}
    public Book(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public void setBookTitle() {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String toString() {
        return "Title: " + bookTitle
                + "\nAuthor: " + author;
    }
}
