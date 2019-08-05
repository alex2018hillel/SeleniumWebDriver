import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends InitialTestClass1 {

    private String actualTitle = "";

    @BeforeMethod
    public void initialize() {
        initializeDriver();
    }

    @Test
    public void loginTestJira() {
        open();
        inputText();
        inputPassword();
        delay(4);
        String actualTitle = actTitle();
        System.out.println(expTitle());
        System.out.println(actualTitle);
        assertEquals(actualTitle, expTitle());
    }

    @AfterMethod
    public void closeDown() {
        delay(4);
        closeDriver();
    }
}
