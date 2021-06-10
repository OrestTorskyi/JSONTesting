import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import tools.JsonParser;
import tools.Websites;

import java.io.IOException;

public class JsonTest {

    Websites websites;

    @BeforeClass
    public void parseJson() {
        try {
            websites = new JsonParser().parseJSON();
        } catch (IOException e) {
            System.out.println("Incorrect path to JSON file!");
            e.printStackTrace();
        }
    }

    @Test
    public void AuthorTest() {
        Assert.assertTrue(websites.searchTitleOnExactWebsite("amazon", "JS")
                , "Book doesn't exist!");
    }

    @Test
    public void NumberOfBooksTest() {
        Assert.assertNotEquals(websites.verifyTotalNumberOfBooks(), 9, "The same entity of books!");
    }


}

