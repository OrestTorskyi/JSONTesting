package tools;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class WebsitesDTO {
    @JsonProperty("websites")
    private List<Map.Entry<String, WebsiteDTO>> websites;

    public WebsitesDTO() {
    }

    public WebsitesDTO(List<Map.Entry<String, WebsiteDTO>> websites) {
        this.websites = websites;
    }

    public List<Map.Entry<String, WebsiteDTO>> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Map.Entry<String, WebsiteDTO>> websites) {
        this.websites = websites;
    }


    public boolean searchTitleOnExactWebsite(String websiteName, String expectedTitle) {
        boolean result = false;
        for (Map.Entry<String, WebsiteDTO> website : this.getWebsites()) {
                if (website.getKey() == websiteName) {
                    List<BookDTO> websiteBooks = website.getValue().getBooks();
                    for (BookDTO book : websiteBooks) {
                        if (book.getBookTitle().equals(expectedTitle)) {
                            result = true;
                        }
                    }
                }
        }
        return result;
    }

    public int verifyTotalNumberOfBooks() {
        int count = 0;
        for (Map.Entry<String, WebsiteDTO> website : this.getWebsites()) {
                count += website.getValue().getBooks().size();
        }
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        WebsitesDTO anotherWebsitesDTO = (WebsitesDTO) o;
        if (this.hashCode() != anotherWebsitesDTO.hashCode()) return false;
        List<Map.Entry<String, WebsiteDTO>> anotherWebsitesList = anotherWebsitesDTO.getWebsites();
        boolean result = false;
        if (websites.size() == anotherWebsitesList.size()) {
            for (int i = 0; i < websites.size(); i++) {
                if (!(websites.get(i).getKey().equals(anotherWebsitesList.get(i).getKey())
                        && websites.get(i).getValue().equals(anotherWebsitesList.get(i).getValue()))) {
                    result = false;
                }
               result = true;
            }
        } else return false;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 0;
        for (Map.Entry<String, WebsiteDTO> website : websites) {
            result = 37 * result + website.getValue().hashCode() + website.getKey().hashCode();
        }
        return result;
    }
}