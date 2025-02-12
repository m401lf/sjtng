package helpers.listener;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ExtentListener implements ITestListener {
    public static ExtentReports extent;
    public static ExtentTest test;

    public void onFinish(ITestContext arg0) {
        // extent.flush();
        Reporter.log(arg0.getName() + " Test Finished..");
        System.out.println(arg0.getName() + " Test Finished..");
    }

    public void onStart(ITestContext arg0) {
        //extent = ExtentManager.getInstance();
        //test = extent.createTest(arg0.getName());
        //test = extent.createTest(arg0.getCurrentXmlTest().getName());
        Reporter.log(arg0.getCurrentXmlTest().getName() + " Class Started..");
        System.out.println(arg0.getCurrentXmlTest().getName() + " Class Started..");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestFailure(ITestResult arg0) {
        //test.log(Status.FAIL, arg0.getThrowable());
        Reporter.log(arg0.getMethod().getMethodName() + " Test Failed.." + arg0.getThrowable());
    }

    public void onTestSkipped(ITestResult arg0) {
        //test.log(Status.SKIP, arg0.getThrowable());
        Reporter.log(arg0.getMethod().getMethodName() + " Test Skipped.." + arg0.getThrowable());
    }

    public void onTestStart(ITestResult arg0) {
        //test.log(Status.INFO, arg0.getName()+" started..");
        Reporter.log(arg0.getMethod().getMethodName() + " Test Started..");
        System.out.println(arg0.getMethod().getMethodName() + " Test Started..");
    }

    public void onTestSuccess(ITestResult arg0) {
        //test.log(Status.INFO, arg0.getName()+" Passed..");
        Reporter.log(arg0.getMethod().getMethodName() + " Test Passed..");
        System.out.println(arg0.getMethod().getMethodName() + " Test Passed..");
    }

}
