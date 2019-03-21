import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import static org.testng.AssertJUnit.assertEquals;

public class ChangeAvatarTest {
    LoginPage loginPage;// = new LoginPage();
    ChangeAvatar changeAvatar; // = new ChangeAvatar();
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

    public void changeAvatarTest() {
        loginPage.open(url);
        loginPage.inputUserName(username);
        loginPage.inputPassword(password);
        Waitings.delay(4000);
        String actualTitle = loginPage.actTitle();
        System.out.println(loginPage.expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, loginPage.expTitle());

        Waitings.delay(5000);
        changeAvatar.clickButtonUser();
        Waitings.delay(1000);
        changeAvatar.clickUserMenu();
        Waitings.delay(3000);
        changeAvatar.clickAvatar();
        Waitings.delay(2000);
        changeAvatar.uploadFileWithRobot();
        Waitings.delay(1000);
        changeAvatar.clickNewAvatar();


      ////  int a = 0;
        ////   changeAvatar.clickButtonUser();
        ////   sendKeys(onElement, charsequence)
        // Waitings.delay(3000);
        //changeAvatar.clickUserMenu();
        // Robot robot = new Robot();
        // robot.mouseMove(-10, -30);
        //  robot.delay(1500);
        //  robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);



        //!!!!changeAvatar.waitAlert();
        //!!!!changeAvatar.chooseFileButton();

    }




    @AfterMethod
    public void closeDown() {
        loginPage.closeDriver();
    }
}
