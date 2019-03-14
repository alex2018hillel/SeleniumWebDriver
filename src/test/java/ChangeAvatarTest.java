import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import java.awt.*;
import java.awt.event.InputEvent;

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
