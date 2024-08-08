package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

public class Video_51_pageLoadCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.get("https://www.colabus.com/");

        // The purpose defaultContent() command is used to come back to parent window
        //If you want to wait till the page load
        //If you want to set the time out for load the page

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        Thread.sleep(2000);
        driver.quit();

    }

}
