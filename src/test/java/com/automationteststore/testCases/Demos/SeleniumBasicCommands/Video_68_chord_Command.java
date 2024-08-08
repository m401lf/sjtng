package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_68_chord_Command {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        //chord() command perform the keyboard action - to like ctrl+z action
        //When we have to perform multiple keyboard action at same time then we have to use this command
        //How to clear all the text from at single time from Textbox, using this we can acheive

        WebElement userName = driver.findElement(By.name("userid"));

        userName.sendKeys("Arun");

        Thread.sleep(1000);
        userName.sendKeys(Keys.chord(Keys.CONTROL, "z"));

        Thread.sleep(2000);
        driver.quit();

    }

}
