package helpers.listener;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class Retry implements IRetryAnalyzer {
    int maxRetryCount = 3;
    private int retryCount = 0;

    public boolean retry(ITestResult arg0) {
        if (retryCount < maxRetryCount) {
            System.out.println("Retrying test " + arg0.getName() + " with status " + getResultStatusName(arg0.getStatus()) + " for the " + (retryCount + 1) + " times.");
            retryCount++;
            return true;
        }
        return false;
    }

    public String getResultStatusName(int status) {
        String resultName = null;
        if (status == 1) {
            resultName = "SUCCESS";
        }
        if (status == 2) {
            resultName = "FAILURE";
        }
        if (status == 3) {
            resultName = "SKIP";
        }
        return resultName;
    }

}
