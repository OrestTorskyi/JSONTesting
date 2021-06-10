package tools;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonParser {

    public Websites parseJSON() throws IOException {
        Websites websites = null;
        ObjectMapper objectMapper = new ObjectMapper();
        websites = objectMapper.readValue(new File("D:/TAQC_Academy/JSONTesting/jsonTask.json"), Websites.class);
        return websites;
    }

}
