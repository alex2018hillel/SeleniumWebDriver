package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemoExample implements ITestListener {
    @Override
    public void onFinish(ITestContext arg0) {
        System.out.println("====  Test Demo Successful  ====");
    }

    @Override
    public void onTestStart(ITestResult arg0) {
        DriverManager.initDriver();
        System.out.println("====  Test Demo Start  ====");
    }

    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }



    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub

    }
}
