package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_71_executeScript_Command {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        //executeScript() command is used when we want to execute the javaScript code in Java using JavaScript interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Heloo Javascript')");

        Thread.sleep(2000);
        driver.quit();

    }

}
