import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ChangeAvatar extends LoginPage {
    //private By buttonUser = By.xpath("//a[@id='header-details-user-fullname']");
    private By buttonUser = By.id("header-details-user-fullname");
    //private By buttonUser = By.cssSelector("li a[title='User profile for Alex_Tropp']");
    private By userMenu = By.xpath("//a[@id='view_profile']");
    private By avatar = By.xpath("//img[@class='avatar-image']");
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
    void chooseFileButton() {
        driver.findElement(chooseFile).click();
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
}

