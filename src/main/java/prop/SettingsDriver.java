package prop;
import org.openqa.selenium.WebDriver;

public class SettingsDriver {
    private static WebDriver driver = null;

    public void closeDriver() {
        driver.close();
    }
}






//   public void  initializeDriver() {
//      driver = new ChromeDriver();
//      return driver;
//    }