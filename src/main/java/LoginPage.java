import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

class LoginPage {
    static String jsessionCookie;
    private By nameField = By.xpath("//*[@id='login-form-username']");
    private By passwordField = By.xpath("//*[@id='login-form-password']");
    final String expectedResultText = "System Dashboard - Hillel IT School JIRA";

    WebDriver driver;

    public LoginPage(WebDriver driver) {
         this.driver = driver;
    }

    void open(String url) {
        driver.get(url);
    }

    void inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    void inputUserName(String username) {
       // Waitings.waitToBeVisible(passwordField);
        driver.findElement(nameField).sendKeys(username, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    String actTitle() {
        return driver.getTitle();
    }

    String expTitle() {
        return expectedResultText;
    }

    void closeDriver() {
        driver.quit();
    }
}

