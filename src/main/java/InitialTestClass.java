import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import prop.App2;

import java.util.concurrent.TimeUnit;

public class InitialTestClass extends App2 {

    private By nameField = By.xpath("//*[@id='login-form-username']");
    private By passwordField = By.xpath("//*[@id='login-form-password']");
    private String username = getDb("db_login");
    private String password = getDb("db_password");

    private By butonTopMenu = By.xpath("//div[@class=’aui-header-primary’]//span[text()=’Create a new issue’]");
    private By inputIssueTypeField = By.xpath("//a[@class='aui-list-item-link aui-iconised-link'][contains(text(),'Test')]");
    private By inputSummaryField = By.xpath("//a[@class='aui-list-item-link aui-iconised-link'][contains(text(),'Test')]");
    private By inputDescriptionField = By.xpath("//a[@class='aui-list-item-link aui-iconised-link'][contains(text(),'Test')]");
    private By butonCreate = By.xpath("//body[@id='tinymce']//p");

    static WebDriver driver;

    public WebDriver initializeDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    public WebDriver setPropertyWindow() {
        driver.manage().window().maximize();
        return driver;
    }

    void open() {
        String url = getDb("db_url");
        System.out.println(url);
        driver.get("http://jira.hillel.it:8080/login.jsp");
        driver.manage().window().maximize();
    }

    void delay(long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    WebDriver signIn(WebDriver driver, By locator) {
        driver.findElement(locator).click();
        return driver;
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
        driver.findElement(inputIssueTypeField).click();   //sendKeys(username, Keys.ENTER);
    }

    void inputSummary() {
        final String nameSummary = "QA-7";
        driver.findElement(inputSummaryField).sendKeys(nameSummary, Keys.ENTER);
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
