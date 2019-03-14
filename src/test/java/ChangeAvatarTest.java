import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import java.awt.*;

import static org.testng.Assert.assertEquals;

public class ChangeAvatarTest {
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

    @Test
    public void loginTestJira() throws AWTException {
        loginPage.open(url);
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
        Waitings.delay(4000);
        String actualTitle = loginPage.actTitle();
        System.out.println(loginPage.expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, loginPage.expTitle());
        //}
        //@Test(description = "ChangeAvatar")
        //public void changeAvatar() throws AWTException {
        loginPage.open("http://jira.hillel.it:8080/secure/ViewProfile.jspa");

        //}
        //@Test(description = "ChangeAvatar")
        // void changeAvatar() throws AWTException {
        Waitings.delay(5000);
        changeAvatar.clickButtonUser();
        Waitings.delay(3000);

        int a = 0;
        ////   changeAvatar.clickButtonUser();
        ////   sendKeys(onElement, charsequence)
        // Waitings.delay(3000);
        //changeAvatar.clickUserMenu();
        // Robot robot = new Robot();
        // robot.mouseMove(-10, -30);
        //  robot.delay(1500);
        //  robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        changeAvatar.clickAvatar();
        changeAvatar.waitAlert();
        changeAvatar.chooseFileButton();

    }

    @AfterMethod
    public void closeDown() {
        loginPage.closeDriver();
    }

}
