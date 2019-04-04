package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemoExample implements ITestListener, WebDriverEventListener {

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onStart(ITestContext arg0) {
        DriverManager.initDriver();
        System.out.println("====  Start  ====");
    }
    @Override
    public void onTestSuccess(ITestResult arg0) {
        System.out.println("====  Test Successful  ====");
    }
    @Override
    public void onTestFailure(ITestResult arg0) {
        System.out.println("====  Test Failure  ====");
    }
    @Override
    public void onTestSkipped(ITestResult arg0) {
        System.out.println("====  Test Skipped  ====");
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        System.out.println("====  Test Failed But With in Success Percentage  ====");
    }
    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("====  Finish  ====");
    }

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Before Navigate To: " + url + " and Current url is: " + driver.getCurrentUrl());
    }
    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("After Navigate To: " + url + " and Current url is: "+ driver.getCurrentUrl());
    }
    @Override
    public void beforeNavigateBack(WebDriver driver) {
        System.out.println("Before Navigate Back. Right now I'm at " + driver.getCurrentUrl());
    }
    @Override
    public void afterNavigateBack(WebDriver driver) {
        System.out.println("After Navigate Back. Right now I'm at " + driver.getCurrentUrl());
    }
    @Override
    public void beforeNavigateForward(WebDriver driver) {
        System.out.println("Before Navigate Forward. Right now I'm at " + driver.getCurrentUrl());
    }
    @Override
    public void afterNavigateForward(WebDriver driver) {
        System.out.println("After Navigate Forward. Right now I'm at " + driver.getCurrentUrl());
    }
    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Before Find By Event");
    }
    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("After Find By Event");
    }
    //////////////////// CLICK ON RELATED METHODS ///////////////
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Before Click On Event");
    }
    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("After Click On Event");
    }
    ///////////////// CHANGE OF VALUE RELATED METHODS //////////////
    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
        System.out.println("Before Change Value Of Event");
    }
    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver) {
        System.out.println("After Change Value Of Event");
    }
    /////////////// SCRIPT EXECUTION RELATED METHODS ///////////////
    @Override
    public void beforeScript(String script, WebDriver driver) {
        System.out.println("Before Script Event");
    }
    @Override
    public void afterScript(String script, WebDriver driver) {
        System.out.println("After Script Event");
    }
    /////////////// EXCEPTION RELATED METHODS ///////////////////////
    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        System.out.println("On Exception");
    }
}
