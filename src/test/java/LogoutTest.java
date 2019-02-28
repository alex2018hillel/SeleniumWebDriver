import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LogoutTest extends InitialTestClass {

    @BeforeMethod
    public void setup() {
        initializeDriver();
    }

    @Test
    public void logoutTestJira() {
        open();
        inputText();
        inputPassword();
        String actualTitle = actTitle();
        System.out.println("Title" + actualTitle);
        String expectedResultText = "System Dashboard - Hillel IT School JIRA";
        assertEquals(actualTitle, expectedResultText);

        Select dropdown = new Select(driver.findElement(By.id("header-details-user-fullname")));
        dropdown.selectByVisibleText("Log Out");      //dropdown.selectByIndex(1);
    }

    @AfterMethod
    public void closeDown() {
        delay(6000);
        driver.close();
    }
}



//private String url = "http://jira.hillel.it:8080/login.jsp";
//private By nameField = By.xpath("//*[@id=\"login-form-username\"]");
//private By passwordField = By.xpath("//*[@id=\"login-form-password\"]");
//private By signInButton = By.id("id=login-form-submit"); //id="login-form-submit"
//private String username = "Alex_Tropp";
//private String password = "Alex_Tropp1";