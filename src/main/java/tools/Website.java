package tools;

import java.util.List;

public class Website {


    private int id;
    private List<Book> books;

    public Website(){}

    public Website( int id, List<Book> books) {
        this.id = id;
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for(Book book : books)
        {
            str.append("\nId: " + id + "\n-----Book-----\n" + book.toString() + "\n------------\n");
        }
        return str.toString();
    }
}
