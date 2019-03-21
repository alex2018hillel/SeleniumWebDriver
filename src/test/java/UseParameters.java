import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UseParameters {

    @Test

    @Parameters("browser")
    public void test1(@Optional("chrome") String name) {
        if(name.equals("chrome")) {
        System.out.println("true");}
        else {System.out.println("false");}
    }
}
