import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import static org.testng.Assert.assertEquals;

public class CreateNewIssueTest {
    private LoginPage loginPage;// = new LoginPage();
    private ChangeAvatar changeAvatar; // = new ChangeAvatar();
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        changeAvatar = new ChangeAvatar(driver);
    }

    @Test(description = "Login JIRA")
    public void loginTestJira() {
        loginPage.open(url);
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
        Waitings.delay(4000);
        String actualTitle = loginPage.actTitle();
        System.out.println(loginPage.expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, loginPage.expTitle());

    }
    @Test(description = "Issure JIRA")
    public void createIssueJira() {
        Waitings.delay(4000);
       // issueJira.clickTopMenu();
      //  Waitings.delay(4000);
      //  issueJira.inputIssueType();
      //  issueJira.inputSummary();
      //  issueJira.inputDescription();
       // issueJira.clickCreate();
    }

    @AfterMethod
    public void closeDown() {
        Waitings.delay(4000);
        loginPage.closeDriver();
    }

}








//private String url = "http://jira.hillel.it:8080/login.jsp";//private By passwordField = By.xpath("//*[@id='login-form-password']");
//*[@id="login-form-submit"]
//private String username = "Alex_Tropp";
//private String password = "Alex_Tropp";
//private String headName = "No description2";
//private String description = "Proba2";
//private By createButton = By.xpath("//*[@id=\"create_link\"]");
//private By headNameField = By.xpath("//*[@id=\"summary\"]");
// private By descriptionField = By.xpath("//*[@id=\"create_link\"]");
// private By createIssueSubmitButton = By.xpath("//*[@id=\"create-issue-submit\"]");