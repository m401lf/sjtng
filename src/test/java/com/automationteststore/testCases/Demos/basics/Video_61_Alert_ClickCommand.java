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

public class Video_61_Alert_ClickCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://omayo.blogspot.com/");

        //moveToElement().click() command is used to move and click to a specific element on the webpage
        // It perform the hover action like mouse click event

        Actions a = new Actions(driver);

        WebElement Blogs = driver.findElement(By.id("blogsmenu"));

        a.moveToElement(Blogs).build().perform();

        a.moveToElement(driver.findElement(By.id("selenium143"))).click().build().perform();


        Thread.sleep(2000);
        driver.quit();

    }

}
