package tools;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonHelper {

    public static WebsitesDTO parseJSON() throws IOException {
        WebsitesDTO websites = null;
        ObjectMapper objectMapper = new ObjectMapper();
        websites = objectMapper.readValue(new File("D:/TAQC_Academy/JSONTesting/jsonTask.json"), WebsitesDTO.class);
        return websites;
    }

}
