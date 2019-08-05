import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    private By buttonUser = By.xpath("//a[@id='header-details-user-fullname']");
    private By userMenu = By.id("view_profile");
    private By logout = By.xpath("//a[@id='log_out']");
    private By submitButton = By.xpath("//input[@id='login-form-submit']");

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }
    void clickButtonUser () {
            driver.findElement(buttonUser).click();
    }
    void clickUserMenu () {
            driver.findElement(userMenu).click();
    }

    void checkLogout() {
        driver.findElement(logout).click();
    }

    void submit() {

        driver.findElement(submitButton).click();
    }


}
