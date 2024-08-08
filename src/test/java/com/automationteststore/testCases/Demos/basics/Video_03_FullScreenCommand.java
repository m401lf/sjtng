package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_03_FullScreenCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();

        //It will open the browser
        driver.get("https://www.qafox.com/selenium/");

        //The purpose of this command is to launch the required browser in fullscreen mode
        driver.manage().window().fullscreen();

        Thread.sleep(2000);
        driver.quit();

    }

    @Test(enabled = false)
    public void f2() {


        WebDriver driver = new ChromeDriver();

        //Will throw the exception because we are not using https   - org.openqa.selenium.InvalidArgumentException: invalid argument
        //Why it will be not open without https?
        driver.get("www.qafox.com/selenium/");

    }

}
