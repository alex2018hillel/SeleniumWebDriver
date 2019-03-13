package prop;

import java.io.*;
import java.util.Properties;

public class PropertyReader {

    public static String getPropertyValue(String key) {

        FileInputStream fis;
        Properties prop = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/jira.properties");
            prop.load(fis);
        } catch (IOException e) {
            System.err.println("ERROR: File not found.");
        }
        return prop.getProperty(key);
    }
}