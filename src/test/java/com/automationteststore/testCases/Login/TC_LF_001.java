package testCases.Login;


import helper.assertion.AssertionHelper;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.*;
import utilities.GlobalVars;

@Listeners(base.Listeners.class)

public class TC_LF_001 extends BaseTest {

    IndexPage ip;
    LoginPage lp;
    AccountPage ap;
    LogoutPage lgp;
    EditPage ep;


    @Test(description = "(TS_002): Login Functionality - Login test with valid credentials")
    public void loginTestValidCredentials() throws Exception {
        ip = new IndexPage(driver);
        lp = ip.clickOnMyAccountAndLoginLink();
        ap = lp.loginInApplication(GlobalVars.getEmailAddress(), GlobalVars.getPass());
        AssertionHelper.updateTestStatus(ap.getMyAccountTxt().contains(GlobalVars.getMyAccount()));
        ep = ap.tapOnEditAsideWidgetLink();
        ap = ep.clickContinue_Button();
        lgp = ap.tapLogoutLinkFromSideWidgetLinks();
        ip = lgp.clickAccountLogoutContinueBtn();
    }

}