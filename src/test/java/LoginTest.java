import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import static org.testng.Assert.assertEquals;

public class LoginTest {
    private LoginPage loginPage = new LoginPage();
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    @BeforeMethod
    public void initialize() {
        loginPage.initializeDriver();
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

    @AfterMethod
    public void closeDown() {
        Waitings.delay(3000);
        loginPage.closeDriver();
    }
}
