package com.automationteststore.testCases.Demos.SeleniumWebDriverBasic.WebDriverInterface;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.fail;

public class setsize_W {
    private WebDriver driver;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        // baseUrl = "http://localhost/whizTrial/index.php";

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void testUntitled() throws Exception {
        driver.get("http://localhost/whizTrial/index.php");
        driver.manage().window().setSize(new Dimension(350, 500));
        System.out.println("Window width: " + driver.manage().window().getSize().getWidth());
        System.out.println("Window height: " + driver.manage().window().getSize().getHeight());
    }

    @AfterMethod
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }
}

	

