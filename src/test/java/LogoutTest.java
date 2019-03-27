import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import prop.PropertyReader;
import prop.Waitings;
import utils.DriverManager;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.Assert.assertEquals;

public class LogoutTest {
    private LoginPage loginPage;
    private LogoutPage logoutPage;
    private String password = PropertyReader.getPropertyValue("password");
    private String username = PropertyReader.getPropertyValue("login");
    private String url = PropertyReader.getPropertyValue("url");

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        loginPage = new LoginPage(driver);
        logoutPage = new LogoutPage(driver);
        driver.manage().timeouts().implicitlyWait(40,SECONDS);
        driver.manage().deleteAllCookies();
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


        LoginPage.jsessionCookie = driver.manage().getCookieNamed("JSESSIONID").getValue();
       // Cookie ck = new Cookie("JSESSIONID", LoginPage.jsessionCookie );

        DriverManager.closeDriver();
        driver = DriverManager.getDriver();
        //Waitings.delay(1000);
        //logoutPage.clickButtonUser();
        //Waitings.delay(1000);
        //logoutPage.checkLogout();
        Cookie ck = new Cookie("JSESSIONID", LoginPage.jsessionCookie );
        driver.manage().addCookie(ck);
        System.out.println(LoginPage.jsessionCookie);
        System.out.println(ck);

        loginPage.open(url);
        Waitings.delay(1000);
        logoutPage.submit();
        Waitings.delay(1000);
        logoutPage.clickButtonUser();
        Waitings.delay(1000);
        logoutPage.clickUserMenu();





          //  int a=1;
        /*Cookie cookie = new Cookie("key", "value");
        driver.manage().addCookie(cookie);

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie loadedCookie : allCookies) {
            System.out.println(String.format("%s -> %s", loadedCookie.getName(), loadedCookie.getValue()));
        }*/

        //Set<Cookie> cookies = driver.manage().getCookies();
        //saveToFile(new File("/path/to/file", cookies);
       //         driver.quit();
    }

/*


    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {

        System.out.println("Screen shot captured====="+arg0.toString());

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub


    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("TestCase started====" +arg0.toString());

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("Congrates Testcase has been passed===="+ arg0.toString());
    }
    @AfterMethod
    public void closeDown() {
        Waitings.delay(1000);
        DriverManager.closeDriver();
    }

*/
}



//private String url = "http://jira.hillel.it:8080/login.jsp";
//private By nameField = By.xpath("//*[@id=\"login-form-username\"]");
//private By passwordField = By.xpath("//*[@id=\"login-form-password\"]");
//private By signInButton = By.id("id=login-form-submit"); //id="login-form-submit"
//private String username = "Alex_Tropp";
//private String password = "Alex_Tropp1";

//<dependency>
//<groupId>org.slf4j</groupId>
//<artifactId>slf4j-simple</artifactId>
//<version>1.6.4</version>
//</dependency>

//<parameter name="configFile" value="app.properties"></parameter>