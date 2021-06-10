package tools;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Websites {
    @JsonProperty("websites")
    private List<Map<String, Website>> websites;

    public Websites(){}

    public Websites(List<Map<String, Website>> websites) {
        this.websites = websites;
    }

    public List<Map<String, Website>> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Map<String, Website>> websites) {
        this.websites = websites;
    }


    public boolean searchTitleOnExactWebsite(String websiteName, String expectedTitle) {
        boolean result = false;
        for (Map<String, Website> website : this.getWebsites()) {
            for (Map.Entry<String, Website> entry : website.entrySet()) {
                if (entry.getKey() == websiteName) {
                    List<Book> websiteBooks = entry.getValue().getBooks();
                    for (Book book : websiteBooks) {
                        if (book.getBookTitle().equals(expectedTitle)) {
                            result = true;
                        }
                    }
                }
            }
        }
        return result;
    }

    public int verifyTotalNumberOfBooks() {
        int count = 0;
        for (Map<String, Website> website : this.getWebsites()) {
            for (Map.Entry<String, Website> entry : website.entrySet()) {
                count += entry.getValue().getBooks().size();
            }
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        for(Map<String, Website> website : websites)
        {
                str.append("\n");
                str.append(str.toString() + "\n");
        }
        return str.toString();
    }

}
