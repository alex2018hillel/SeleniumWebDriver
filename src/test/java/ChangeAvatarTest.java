import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import java.awt.*;

import static org.testng.Assert.assertEquals;

public class ChangeAvatarTest {
    private LoginPage loginPage = new LoginPage();
    private ChangeAvatar changeAvatar = new ChangeAvatar();
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    @BeforeMethod
    public void setup() {
        loginPage.initializeDriver();
    }

    @Test(description = "loginJira")
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
    @Test(description = "ChangeAvatar")
    public void changeAvatar() throws AWTException {
        Waitings.delay(5000);
        changeAvatar.clickButtonUser();
        Waitings.delay(3000);
                                   //changeAvatar.clickUserMenu();
        Robot robot = new Robot();
        robot.mouseMove(-10, -30);
        robot.delay(1500);

        changeAvatar.clickAvatar();
        changeAvatar.chooseFileButton();

    }

    @AfterMethod
    public void closeDown() {
        loginPage.closeDriver();
    }

}
