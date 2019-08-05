import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ChangeAvaterTest extends InitialTestClass1{

        private String expectedPageJira = "System Dashboard - Hillel IT School JIRA";

        @BeforeMethod
        public void setup() {
            initializeDriver();
        }

        @Test
        public void loginTestJira() {
            open();
            inputText();
            inputPassword();
            delay(2);
            String actualTitle = actTitle();
            System.out.println(actualTitle);
            String expectedResultText = expectedPageJira;
            delay(3);
            assertEquals(actualTitle, expectedResultText);

            clickTopMenu();
            delay(3);

            inputIssueType();
            inputSummary();
            inputDescription();
            clickCreate();

        }

        @AfterMethod
        public void closeDown() {
            delay(4);
            closeDriver();
        }
    }


