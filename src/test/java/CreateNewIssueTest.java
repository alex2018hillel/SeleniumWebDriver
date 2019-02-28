import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CreateNewIssueTest extends InitialTestClass1 {

    private String expectedPageJira = "System Dashboard - Hillel IT School JIRA";

    @BeforeMethod
    public void setup() {
        initializeDriver();
    }

    @Test
    public void loginTestJira() {
        open();
        inputText();
        inputPassword();
        delay(2000);
        String actualTitle = actTitle();
        System.out.println(actualTitle);
        String expectedResultText = expectedPageJira;
        delay(3000);
        assertEquals(actualTitle, expectedResultText);

        clickTopMenu();
        delay(3000);
        inputIssueType();
        inputSummary();
        inputDescription();
        clickCreate();

    }

    @AfterMethod
    public void closeDown() {
        delay(6000);
        closeDriver();
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