package testCases.Demos.DemoPractice.Selenium_WebDriver_Basic.WebDriverInterface;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class getpagesource_W {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void testClickonthefooterlink() throws Exception {
        driver.get("http://localhost/whizTrial/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String Source = driver.getPageSource();
        System.out.println(Source);
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "WhizTrial Registration");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();

    }
}


