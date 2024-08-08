package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_25_getPageSourceCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getPageSource() command to get the html page value of the current webpage
        String data = driver.getPageSource();
        System.out.println(data);

        Thread.sleep(2000);
        driver.quit();

    }

}
