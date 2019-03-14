import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

class IssuePage  {
    private WebDriver driver;
    private By buttonTopMenu = By.xpath("//li[@id='create-menu']");
    private By inputSummaryField = By.xpath("//input[@id='summary']");
    private By inputDescriptionField = By.xpath("//body[@id='tinymce']//p");
    private By buttonCreate = By.xpath("//body[@id='tinymce']//p");

    public IssuePage(WebDriver driver) {
        this.driver = driver;
    }

    void clickTopMenu() {
        driver.findElement(buttonTopMenu).click();
    }

    void inputIssueType() {
        //driver.findElement(inputIssueTypeField).sendKeys("Te");
        ///////////////////driver.findElement(inputIssueTypeField).click();
        //delay(1000);
        //driver.findElement(inputIssueTypeField1).click();
        driver.findElement(By.id("issuetype-field")).sendKeys("Test", Keys.ENTER);
        //driver.switchTo().frame("menu");
        driver.findElement(By.linkText("Test")).click();
//driver.findElement(By.id("issuetype-field")).click();
//        driver.switchTo().frame("menu");
//        driver.findElement(By.linkText("Операции с нац. валютой")).click();

        ////DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();

        ////capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
        ////capabilities.setCapability(InternetExplorerDriver.
        //// INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


      //   JavascriptExecutor js = (JavascriptExecutor)driver;
      //  js.executeScript("aui-list-item-link aui-iconised-link"); //"aui-list-item-link aui-iconised-link"
      //  driver.findElement(By.tagName("a")).click();


        //js.executeScript("issuetype-field");
        //driver.findElement(By.id("test-52")).click();
        //driver.findElement(By.linkText("aui-list-item-link aui-iconised-link")).click();
        //driver.findElement(By.xpath("//*[contains(text(), 'Test')]").click();
    }

    void inputSummary() {
        final String nameSummary = "QA-7";
        driver.findElement(inputSummaryField).sendKeys(nameSummary);  //, Keys.ENTER
    }

    void inputDescription() {
        final String nameSummary1 = "Hello world";
        driver.findElement(inputDescriptionField).sendKeys(nameSummary1, Keys.ENTER);
    }

    void clickCreate() {
        driver.findElement(buttonCreate).click();
    }

}
