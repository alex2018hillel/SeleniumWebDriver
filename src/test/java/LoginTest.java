import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;

import java.io.File;
import java.io.IOException;

import static org.openqa.selenium.OutputType.FILE;
import static org.testng.Assert.assertEquals;

public class LoginTest {
    private LoginPage loginPage;// = new LoginPage();
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    private WebDriver driver;

    @BeforeMethod
    public void initialize() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
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

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(FILE);
        try {

            FileUtils.copyFile(scrFile, new File("C:\\MyScreenShot.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void closeDown() {
        Waitings.delay(3000);
        loginPage.closeDriver();
    }
}
