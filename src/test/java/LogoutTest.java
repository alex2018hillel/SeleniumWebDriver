import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import static org.testng.Assert.assertEquals;

public class LogoutTest {
    private LoginPage loginPage;
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void logoutTestJira() {
        loginPage.open(url);
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
        Waitings.delay(4000);
        String actualTitle = loginPage.actTitle();
        System.out.println(loginPage.expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, loginPage.expTitle());

        //Select dropdown = new Select(driver.findElement(By.id("header-details-user-fullname")));
        //dropdown.selectByVisibleText("Log Out");      //dropdown.selectByIndex(1);
    }

    @AfterMethod
    public void closeDown() {

    }
}



//private String url = "http://jira.hillel.it:8080/login.jsp";
//private By nameField = By.xpath("//*[@id=\"login-form-username\"]");
//private By passwordField = By.xpath("//*[@id=\"login-form-password\"]");
//private By signInButton = By.id("id=login-form-submit"); //id="login-form-submit"
//private String username = "Alex_Tropp";
//private String password = "Alex_Tropp1";