package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver = null;

    public static void initDriver() {
        //System.setProperty("webdriver.chrome.driver", PropertyReader.getPropertyValue("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2018.3.4\\chromedriver.exe"));
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2018.3.4\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static WebDriver getDriver() {
    return driver;
    }
    public static void closeDriver() {
        driver.close();
    }
}