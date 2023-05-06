package listeners;

import Reporting.Reporter;
import base.BaseTest;
import org.testng.*;

public class Listeners  implements IExecutionListener, ITestListener {
    BaseTest browserInstantiate=new BaseTest();


    @Override
    public void onExecutionStart() {
        Reporter.init();
    }

    @Override
    public void onExecutionFinish() {
    Reporter.generateReport();
    }
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(iTestResult.getName());
        System.out.println("Test case failed !");
        browserInstantiate.failedScreenShots(iTestResult.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

}
