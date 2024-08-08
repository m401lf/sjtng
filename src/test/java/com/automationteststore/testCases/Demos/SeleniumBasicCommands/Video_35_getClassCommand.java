package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_35_getClassCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getClass() command is used to find the class name of Object Reference
        String webdriverReferenceClassName = driver.getClass().getSimpleName();
        System.out.println(webdriverReferenceClassName);


        Thread.sleep(2000);
        driver.quit();

    }

}
