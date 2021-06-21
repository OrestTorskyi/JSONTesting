import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.BookDTO;
import tools.JsonHelper;
import tools.WebsiteDTO;
import tools.WebsitesDTO;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonTest {

    WebsitesDTO websites;

    @BeforeClass
    public void parseJson() {
        try {
            websites = JsonHelper.parseJSON();
        } catch (IOException e) {
            System.out.println("Incorrect path to JSON file!");
            e.printStackTrace();
        }
    }

//    @Test
//    public void AuthorTest() {
//        Assert.assertTrue(websites.searchTitleOnExactWebsite("amazon", "JS")
//                , "BookDTO doesn't exist!");
//    }
//
//    @Test
//    public void NumberOfBooksTest() {
//        Assert.assertNotEquals(websites.verifyTotalNumberOfBooks(), 9, "The same entity of books!");
//    }

    @Test
    public void compareBooksTest() {
        BookDTO expectedBook = new BookDTO("Test2", "JS");
        List<Map.Entry<String, WebsiteDTO>> current = websites.getWebsites();
        WebsiteDTO website = current.get(0).getValue();
        BookDTO actualBook = website.getBooks().get(1);
        Assert.assertTrue(expectedBook.equals(actualBook), "The books aren't the same!");
    }

}

