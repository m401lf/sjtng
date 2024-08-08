package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_06_ClickCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();

        //The purpose of this command is to launch the required browser in fullscreen mode
        driver.manage().window().maximize();


        //It will open the browser
        driver.get("http://omayo.blogspot.com/");

        //used to click on the required UI Element
        WebElement element = driver.findElement(By.id("prompt"));
        element.click();

        Thread.sleep(2000);
        driver.quit();

    }

}
