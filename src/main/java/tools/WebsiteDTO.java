package tools;

import java.util.List;

public class WebsiteDTO {


    private int id;
    private List<BookDTO> books;

    public WebsiteDTO() {
    }

    public WebsiteDTO(int id, List<BookDTO> books) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WebsiteDTO anotherWebsite = (WebsiteDTO) o;
        if (this.hashCode() != anotherWebsite.hashCode()) return false;
        if (this.getId() == anotherWebsite.getId() && this.books.size() == anotherWebsite.getBooks().size()) {
            for (int i = 0; i < this.getBooks().size(); i++) {
                if(this.books.get(i).equals(anotherWebsite.getBooks().get(i)) == false) return false;
            }
            return true;
        } else return false;
    }

    @Override
    public int hashCode() {
        int result = id;
        for (BookDTO book : books) {
            result = 37 * result + book.hashCode();
        }
        return result;
    }
}
