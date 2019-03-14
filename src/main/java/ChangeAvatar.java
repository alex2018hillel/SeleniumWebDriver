import org.apache.bcel.generic.Select;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeAvatar extends LoginPage {
    private By buttonUser = By.xpath("//a[@id='header-details-user-fullname']");
    //private By buttonUser = By.id("header-details-user-fullname");
    //private By buttonUser = By.xpath("//a[@title='User profile for Alex_Tropp']");
    private By userMenu = By.xpath("//a[@id='view_profile']");
    //private By avatar = By.xpath("//div[@id='details-profile-fragment']//div[@class='mod-content']//li//button[@id='details-user-avatar-trigger']");
    private By avatar = By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/dl[1]/dd[1]/div[1]/button[1]");
    private By chooseFile = By.xpath("//a[@id='jira-avatar-uploader']");
    //private By chooseFile = By.xpath("//input[@name='avatar']");

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
        Alert wait = (new WebDriverWait(driver, 10))  //
                .until(ExpectedConditions.alertIsPresent());
    }

    void chooseFileButton() {

        driver.switchTo().alert().accept();
        //driver.findElement(chooseFile).click();
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