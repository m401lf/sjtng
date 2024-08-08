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

public class Video_62_DragAndDropByCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/p/page3.html");

        //dragAndDropBy command is used to drag and drop of an element on the webpage

        Actions a = new Actions(driver);

        WebElement slider = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));

        Thread.sleep(2000);
        a.dragAndDropBy(slider, 100, 0).build().perform(); //Move Right side

        Thread.sleep(2000);
        a.dragAndDropBy(slider, -100, 0).build().perform();  //Move Left Side


        Thread.sleep(2000);
        driver.quit();

    }

}
