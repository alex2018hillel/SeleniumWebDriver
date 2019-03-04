import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import prop.App1;

import java.util.concurrent.TimeUnit;

public class InitialTestClass1 extends App1 {

    private By nameField = By.xpath("//*[@id='login-form-username']");

    private By passwordField = By.xpath("//*[@id='login-form-password']");
    private String username = getDb("db_login");
    private String password = getDb("db_password");

    private By butonTopMenu = By.xpath("//li[@id='create-menu']");
    //private By inputIssueTypeField = By.xpath("//input[@id='issuetype-field']");
    //private By inputIssueTypeField1 = By.xpath("//div[@id='issuetype-suggestion']//li[@id='test-52']");
    //private By inputIssueTypeField1 = By.xpath("//div[@class='aui-list-scroll']//li[@id='test-52']");
    //private By inputIssueTypeField = By.xpath("//select[@id='issuetype-field']/a[text()='Test']");
    //private By inputIssueTypeField = By.xpath("//li[@id='test-18']//a[text()='Test']");
    //private By inputIssueTypeField = By.xpath("//input[@id='issuetype-field']");
    //private By inputIssueTypeField1 = By.xpath("//a[contains(text(),'Test')]");
    private By inputSummaryField = By.xpath("//input[@id='summary']");
    private By inputDescriptionField = By.xpath("//body[@id='tinymce']//p");
    private By butonCreate = By.xpath("//body[@id='tinymce']//p");
    //
    WebDriver driver;

    public WebDriver initializeDriver() {
        driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        return driver;
    }

    void open() {
        driver = new ChromeDriver();
        String url = getDb("db_url");
        System.out.println(url);
        driver.get(url);
        //driver.get("http://jira.hillel.it:8080/login.jsp");
        driver.manage().window().maximize();
    }

    void delay(long millisec) {
        try {
            Thread.sleep(millisec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //driver, signInButton
    //WebDriver signIn(WebDriver driver, By locator) {
     //   driver.findElement(locator).click();
     //   return driver;}

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
        //String expectedValue = "System Dashboard - Hillel IT School JIRA";
        String expectedResultText = "System Dashboard - Hillel IT School JIRA";
        return expectedResultText;
    }

    void clickTopMenu() {
        driver.findElement(butonTopMenu).click();
    }

    void inputIssueType() {
        //driver.findElement(inputIssueTypeField).sendKeys("Te");
        ///////////////////driver.findElement(inputIssueTypeField).click();
        //delay(1000);
        //driver.findElement(inputIssueTypeField1).click();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("issuetype-field");
        //driver.findElement(By.id("test-52")).click();
        driver.findElement(By.linkText("Test")).click();
        //driver.findElement(By.xpath("//*[contains(text(), 'Test')]").click();
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