package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_01_GetCommand {

    @Test(enabled = true)
    public void f1() {


        WebDriver driver = new ChromeDriver();

        //It will open the browser
        driver.get("https://www.qafox.com/selenium/");

    }

    @Test(enabled = false)
    public void f2() {


        WebDriver driver = new ChromeDriver();

        //Will throw the exception because we are not using https   - org.openqa.selenium.InvalidArgumentException: invalid argument
        //Why it will be not open without https?
        driver.get("www.qafox.com/selenium/");

    }

}
