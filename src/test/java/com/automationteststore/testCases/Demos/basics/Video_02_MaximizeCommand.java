package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_02_MaximizeCommand {

    @Test(enabled = false)
    public void f1() {


        WebDriver driver = new ChromeDriver();
        //It will maximize the browser
        driver.manage().window().maximize();
        //It will open the browser
        driver.get("https://www.qafox.com/selenium/");

    }


}
