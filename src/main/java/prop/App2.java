package prop;

import java.io.*;
import java.util.Properties;

public class App2 {

        public static String getDb(String key) {

        FileInputStream fis;
        Properties prop = new Properties();

        try {
            fis = new FileInputStream("src/main/resources/jira.properties");
            prop.load(fis);
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
        return prop.getProperty(key);
    }

    public void delay(long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}







//private void closeDriver() {
//  void closeDriver() {
//      //driver.close();
//  }
//
//
// String a = getdb("db_login");
//*[@id="app"]/div/div[1]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input
//#app > div > div.ll-application__content.ll-application__content__m-routed > div > div.ll-landing__main > div.ll-landing__main-right > div.ll-landing__main-right-LoginForm > div.ll-landing__main-right-LoginForm-form > div.ll-login-form > div:nth-child(1) > input