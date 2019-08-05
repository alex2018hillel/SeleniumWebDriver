import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import prop.App1;

import java.util.concurrent.TimeUnit;

public class InitialTestClass1 extends App1 {

    private By nameField = By.xpath("//*[@id='login-form-username']");

    private By passwordField = By.xpath("//*[@id='login-form-password']");
    private String username = getDb("db_login");
    private String password = getDb("db_password");

    private By butonTopMenu = By.xpath("//li[@id='create-menu']");
    private By inputSummaryField = By.xpath("//input[@id='summary']");
    private By inputDescriptionField = By.xpath("//body[@id='tinymce']//p");
    private By butonCreate = By.xpath("//body[@id='tinymce']//p");

    WebDriver driver;

    public WebDriver initializeDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    void open() {
        driver = new ChromeDriver();
        String url = getDb("db_url");
        System.out.println(url);
        driver.get(url);
        driver.manage().window().maximize();
    }

    void delay(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    WebDriver inputText() {
        driver.findElement(nameField).sendKeys(username, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
    WebDriver inputPassword() {
        driver.findElement(passwordField).sendKeys(password, Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    String actTitle() {
        return driver.getTitle();
    }

    String expTitle() {
        String expectedResultText = "System Dashboard - Hillel IT School JIRA";
        return expectedResultText;
    }

    void clickTopMenu() {
        driver.findElement(butonTopMenu).click();
    }

    void inputIssueType() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("issuetype-field");
        driver.findElement(By.linkText("Test")).click();
    }

    void inputSummary() {
        final String nameSummary = "QA-7";
        driver.findElement(inputSummaryField).sendKeys(nameSummary);  //, Keys.ENTER
    }

    void inputDescription() {
        final String nameSummary1 = "Hello world";
        driver.findElement(inputDescriptionField).sendKeys(nameSummary1, Keys.ENTER);
    }

    void clickCreate() {
        driver.findElement(butonCreate).click();
    }

    void closeDriver() {
        driver.close();
    }
}
