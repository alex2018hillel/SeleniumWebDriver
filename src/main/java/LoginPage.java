import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import prop.App1;
import java.util.concurrent.TimeUnit;

public class LoginPage extends App1 {
    private By nameField = By.xpath("//*[@id='login-form-username']");
    private By passwordField = By.xpath("//*[@id='login-form-password']");


    WebDriver driver;

    void open(String url) {
        driver = new ChromeDriver();
        //String url = getDb("db_url");
        System.out.println(url);
        driver.get(url);
        driver.manage().window().maximize();
    }


    void inputPassword(String password) {
        driver.findElement(passwordField).sendKeys(password, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // return driver;
    }

    void inputText(String username) {
            driver.findElement(nameField).sendKeys(username, Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           // return driver;

    }

    String actTitle() {
        return driver.getTitle();
    }

    String expTitle() {
        //String expectedValue = "System Dashboard - Hillel IT School JIRA";
        String expectedResultText = "System Dashboard - Hillel IT School JIRA";
        return expectedResultText;
    }

}
