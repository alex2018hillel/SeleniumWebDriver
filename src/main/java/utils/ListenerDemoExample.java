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
    public void beforeNavigateTo(String s, WebDriver webDriver) {

    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}
