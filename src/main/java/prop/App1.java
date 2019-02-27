package prop;

import java.io.*;
import java.util.Properties;

public class App1 {

    public static String getDb(String key) {

        FileInputStream fis;
        Properties prop = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/jira.properties");
            prop.load(fis);
            // String host = prop.getProperty("db_host");
            // String login = prop.getProperty("db_login");
            // String password = prop.getProperty("db_password");

            // System.out.println("HOST: " + host
            //        + ", LOGIN: " + login
            //        + ", PASSWORD: " + password);
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        return prop.getProperty(key);
    }
}


