import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

//import InitialTestClass;

public class LoginTest extends InitialTestClass1 {
//public class LoginTest {

    private String actualTitle = "";

    @BeforeMethod
    public void initialize() {
        initializeDriver();
    }

    @Test
    public void loginTestJira() {
        //open(url);
        open();
        //inputText(driver, nameField, username);
        inputText();
        //inputPassword(driver, passwordField, password);
        inputPassword();
        delay(4000);
        String actualTitle = actTitle();
        System.out.println(expTitle());
        System.out.println(actualTitle);
        //signIn(driver, signInButton);
        assertEquals(actualTitle, expTitle());
    }

    @AfterMethod
    public void closeDown() {
        delay(3000);
        closeDriver();
    }
}
