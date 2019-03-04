package prop;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingsDriver {
    WebDriver driver;

    public void  initializeDriver() {
        driver = new ChromeDriver();
       // return driver;
    }
    public void closeDriver() {
        driver.close();
    }
}






