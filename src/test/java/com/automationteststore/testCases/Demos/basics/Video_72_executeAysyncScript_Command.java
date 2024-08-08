package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_72_executeAysyncScript_Command {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        //executeAysyncScript() command is used to execute Asynchronous the javaScript code in Java using JavaScript interface
        //Here Time is constraint -> If something is taking less time server first and if something is taking more time serve last
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeAsyncScript("window.setTimeout(function(){alert('world');},4000);alert('Heloo Javascript');");
        js.executeAsyncScript("window.setTimeout(function(){alert('world');},6000);alert('Heloo Javascript');");

        Thread.sleep(2000);
        driver.quit();

    }

}
