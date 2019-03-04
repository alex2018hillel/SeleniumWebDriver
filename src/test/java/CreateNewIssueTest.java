import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.App2;
import prop.SettingsDriver;
import static org.testng.Assert.assertEquals;

public class CreateNewIssueTest extends App2 {

    private String password = getDb("db_password");
    private String username = getDb("db_login");
    private String url = getDb("db_url");
    //private String expectedPageJira = "System Dashboard - Hillel IT School JIRA";

    @BeforeMethod
    public void setup() {
        SettingsDriver driver = new SettingsDriver();
        driver.initializeDriver();
    }

    @Test(description = "Login JIRA")
    public void loginTestJira() {
        LoginPage loginJira = new LoginPage();

        loginJira.open(url);
        loginJira.inputText(username);
        loginJira.inputPassword(password);
        delay(4000);
        String actualTitle = loginJira.actTitle();
        System.out.println(loginJira.expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, loginJira.expTitle());

    }
    @Test(description = "Issure JIRA")
    public void createIssueJira() {
        IssuePage issueJira = new IssuePage();

        issueJira.clickTopMenu();
        delay(3000);
        issueJira.inputIssueType();
        issueJira.inputSummary();
        issueJira.inputDescription();
        issueJira.clickCreate();
    }

    @AfterMethod
    public void closeDown() {
        SettingsDriver driver = new SettingsDriver();

        delay(3000);
        driver.closeDriver();
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