import org.apache.bcel.generic.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeAvatar extends LoginPage {
    private By buttonUser = By.xpath("//a[@id='header-details-user-fullname']");
    //private By buttonUser = By.id("header-details-user-fullname");
    //private By buttonUser = By.xpath("//a[@title='User profile for Alex_Tropp']");
    private By userMenu = By.xpath("//a[@id='view_profile']");
    private By avatar = By.xpath("//div[@id='details-profile-fragment']//div[@class='mod-content']//li//button[@id='details-user-avatar-trigger']");
    private By chooseFile = By.xpath("//li[@title='Select this avatar']//button[@id='select-avatar-button']");

    void clickButtonUser() {
        driver.findElement(buttonUser).click();
    }

    void clickUserMenu() {
        driver.findElement(userMenu).click();
    }
    void clickAvatar() {
        driver.findElement(avatar).click();
    }
    void waitAlert() {
        Alert alert = driver.switchTo().alert();
        String alertMessage= alert.getText();
        alert.accept();
        System.out.println("Alert msg is : "+alertMessage);
        Alert wait = (new WebDriverWait(driver, 5))  // как дожлаться алерта?
                .until(ExpectedConditions.alertIsPresent());
    }

    void chooseFileButton() {
        WebElement element=driver.findElement(chooseFile);
        element.click();
        //Actions.moveToElement(driver.findElement(chooseFile).click());
        //Actions click(WebElement);
        //driver.switchTo().alert().accept();
    }
}




//void inputIssueType() {
//driver.findElement(inputIssueTypeField).sendKeys("Te");
///////////////////driver.findElement(inputIssueTypeField).click();
//delay(1000);
//driver.findElement(inputIssueTypeField1).click();
// driver.findElement(By.id("issuetype-field")).sendKeys("Test", Keys.ENTER);
//driver.switchTo().frame("menu");
//  driver.findElement(By.linkText("Test")).click();

// }