import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseParametersDataProvider {

    @DataProvider(name = "Authentication")

    public static Object[][] credentials() {

        return new Object[][] {
                { "testuser_1", "Test@123" },
                { "testuser_2", "Test@345" }
        };
    }

    @Test(dataProvider = "Authentication")

    //@Parameters({ "PROBA", "configFile" })
    public void test2(String userName1, String userName2) {
        System.out.println(userName1);
        System.out.println(userName2);
    }
}
