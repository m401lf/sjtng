package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import utilities.GlobalVars;

import java.time.Duration;

public class Video_52_setScriptTimeoutCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //The purpose of setScriptTimeout() is wait for load a specific element on the page which element can get some extra time to load on the page even after load the complete page
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(GlobalVars.PAGE_LOAD_TIME));
        driver.get("http://omayo.blogspot.com/");

        boolean isbuttonDisplayed = driver.findElement(By.id("but2")).isDisplayed();
        System.out.println(isbuttonDisplayed);

        Thread.sleep(2000);
        driver.quit();

    }

}
