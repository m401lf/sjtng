package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_60_moveToCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://omayo.blogspot.com/");

        //moveToElement() command is used to move to a specific element on the webpage

        Actions a = new Actions(driver);

        WebElement Blogs = driver.findElement(By.id("blogsmenu"));

        a.moveToElement(Blogs).build().perform();

        Thread.sleep(2000);
        driver.quit();

    }

}
