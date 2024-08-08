package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_27_submitCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        driver.findElement(By.id("input-email")).sendKeys("arun.selenium@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Second@123");
        // The purpose submit() command to submit the application without hit the login button
        //It is alternate of click() action
        driver.findElement(By.id("input-password")).submit();

        Thread.sleep(2000);

        driver.quit();

    }

}
