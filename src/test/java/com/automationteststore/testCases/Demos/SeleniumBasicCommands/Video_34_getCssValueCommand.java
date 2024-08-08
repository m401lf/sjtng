package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_34_getCssValueCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getCssValue() command is used to find the cssValue (Style attributes value) of a  webElement from the webPage
        String colorValue = driver.findElement(By.id("home")).getCssValue("color");
        System.out.println(colorValue);

        String fontValue = driver.findElement(By.id("home")).getCssValue("font");
        System.out.println(fontValue);


        Thread.sleep(2000);
        driver.quit();

    }

}
