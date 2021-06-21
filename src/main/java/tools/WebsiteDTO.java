package tools;

import java.util.List;

public class Website {


    private int id;
    private List<BookDTO> books;

    public Website(){}

    public Website( int id, List<BookDTO> books) {
        this.id = id;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(List<BookDTO> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for(BookDTO book : books)
        {
            str.append("\nId: " + id + "\n-----BookDTO-----\n" + book.toString() + "\n------------\n");
        }
        return str.toString();
    }
}
