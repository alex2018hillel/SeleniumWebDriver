import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;
import utils.DriverManager;

import java.io.File;
import java.io.IOException;

import static org.testng.Assert.assertEquals;

//import prop.SettingsDriver;

public class LoginTest {
    private LoginPage loginPage;
    //private SettingsDriver settingsDriver;
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    WebDriver driver;

    @BeforeMethod
    public void initialize() {
     driver = DriverManager.getDriver();     //driver = new ChromeDriver();
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


        if (!actualTitle.equals(loginPage.expTitle())) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {

                FileUtils.copyFile(scrFile, new File("C:\\maven\\MyScreenShot.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        assertEquals(actualTitle, loginPage.expTitle());
    }

    @AfterMethod
    public void closeDown() {
        Waitings.delay(3000);
        DriverManager.closeDriver();
    }
}
