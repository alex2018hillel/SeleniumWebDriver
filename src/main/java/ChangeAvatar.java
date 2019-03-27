import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class ChangeAvatar {

    private By buttonUser = By.xpath("//a[@id='header-details-user-fullname']");
    private By userMenu = By.id("view_profile");
    private By avatar = By.xpath("//button[@id='details-user-avatar-trigger']");
    private By chooseFile = By.xpath("//input[@id='jira-avatar-uploader']");
    private By newAvatar = By.xpath("(//button[@id='select-avatar-button'])[21]");
    private By confirm = By.xpath("//input[@type='submit']");
    private By userAvatarButton = By.xpath("//button[@id='select-avatar-button']");

    private WebDriver driver;

    public ChangeAvatar( WebDriver driver) { //
        this.driver = driver;
    }
    void clickButtonUser() {
        driver.findElement(buttonUser).click();
    }
    void clickUserMenu() {
        driver.findElement(userMenu).click();
    }
    void clickAvatar() {
        driver.findElement(avatar).click();
    }

    public void uploadFileWithRobot () {
        String imagePath;
        imagePath = System.getProperty("user.home")+"\\Images\\small.jpg";
        System.out.println(imagePath);

        WebElement fileInput = driver.findElement(chooseFile);
        fileInput.sendKeys(imagePath);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(4000);

        WebElement element = driver.findElement(confirm);
        Actions actions = new Actions(driver);
        actions.moveToElement(element, 1, 1).click().build().perform();
        robot.delay(2000);

        List<WebElement> allElements = driver.findElements(userAvatarButton);
        int size = allElements.size();

        WebElement avatarButton = driver.findElement(By.xpath("(//button[@id='select-avatar-button'])["+ size +"]"));
        actions.moveToElement(avatarButton, 1, 1).click().build().perform();
        robot.delay(2000);
    }

    public void clickNewAvatar() {
        driver.findElement(newAvatar).click();
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

//WebElement element_p = (new WebDriverWait(driver, 3))
//        .until(ExpectedConditions.visibilityOfElementLocated(By
//                .xpath("//input[@id='jira-avatar-uploader']")));
//element_p.sendKeys(Keys.ENTER);
//element_p.sendKeys(imagePath);

//  StringSelection stringSelection = new StringSelection(imagePath);
//  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
// clipboard.setContents(stringSelection, null);

// System.out.println(stringSelection);
// System.out.println(clipboard);

// robot.keyPress(KeyEvent.VK_ENTER);
//  robot.keyRelease(KeyEvent.VK_ENTER);
//  robot.delay(500);
//driver.inputFileElement
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_ENTER);
//robot.delay(500);
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_INSERT);
//robot.keyRelease(KeyEvent.VK_INSERT);
//robot.keyRelease(KeyEvent.VK_CONTROL);

// actions.click(findElement(By.xpath("//input[@type='submit']"));
//actions.keyDown(Keys.CONTROL);
//  actions.sendKeys("v");

//String pathAvatar = allElements.get(allElements.size()-1).getText();

//driver.findElement(By.xpath("//input[@type='submit']")).click();
//driver.switchTo().alert().accept();
