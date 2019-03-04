import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.App2;
import prop.SettingsDriver;

import static org.testng.Assert.assertEquals;

public class LoginTest extends App2 {

    private String password = getDb("db_password");
    private String username = getDb("db_login");
    private String url = getDb("db_url");

    @BeforeMethod
    public void initialize() {
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

    @AfterMethod
    public void closeDown() {
        SettingsDriver driver = new SettingsDriver();
        delay(3000);
        driver.closeDriver();
    }


}
