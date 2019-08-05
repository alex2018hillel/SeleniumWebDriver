import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;
import utils.DriverManager;

import static org.testng.AssertJUnit.assertEquals;

public class ChangeAvatarTest {
    private LoginPage loginPage;
    private ChangeAvatar changeAvatar;
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
        changeAvatar = new ChangeAvatar(driver);
    }
    @Test(groups = {"smoke"})
    public void loginTest() {
        loginPage.open(url);
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
        Waitings.delay(4000);
        String actualTitle = loginPage.actTitle();
        System.out.println(loginPage.expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, loginPage.expTitle());
    }
    @Test(groups = {"feature"})
    public void changeAvatarTest() {
        System.out.println("===  Change Avatar Test  === ");

        Waitings.delay(5000);
        changeAvatar.clickButtonUser();
        Waitings.delay(1000);
        changeAvatar.clickUserMenu();
        Waitings.delay(3000);
        changeAvatar.clickAvatar();
        Waitings.delay(2000);
        changeAvatar.uploadFileWithRobot();
    }
    @AfterMethod
    public void closeDown() {
        DriverManager.closeDriver();
    }
}
