package tools;


public class BookDTO {

    private String author;
    private String bookTitle;

    public BookDTO() {
    }

    public BookDTO(String author, String bookTitle) {
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public void setBookTitle(String bookTitle) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO anotherBook = (BookDTO) o;
        int first = this.hashCode();
        int test = anotherBook.hashCode();
        if (first != test) return false;
        if ((this.author.equals(anotherBook.getAuthor())) && (this.bookTitle.equals(anotherBook.getBookTitle()))) return true;
        else return false;
    }


    @Override
    public int hashCode() {
        int result = author.hashCode();
        result = 37 * result + bookTitle.hashCode();
        return result;
    }
}
