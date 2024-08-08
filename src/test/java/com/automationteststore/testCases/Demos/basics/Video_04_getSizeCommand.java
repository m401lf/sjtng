package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_04_getSizeCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();

        //The purpose of this command is to launch the required browser in fullscreen mode
        driver.manage().window().maximize();


        //It will open the browser
        driver.get("https://www.qafox.com/selenium/");

        //The purpose of this command is to resize the browser window
        Dimension d = new Dimension(300, 650);
        driver.manage().window().setSize(d);

        Thread.sleep(2000);
        driver.quit();

    }

}
