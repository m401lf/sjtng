package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_10_ClassLocatorCommand {

    @Test(enabled = true)
    public void f1() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        //We can use the class locator to enter the value in the required element
        WebElement element = driver.findElement(By.className("classone"));
        element.sendKeys("1234");

        Thread.sleep(2000);
        driver.quit();

    }

}
