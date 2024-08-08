package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_66_KeyDown_KeyUp_Command {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");

        //KeyDown() and KeyUp() command is used to open a new tab on clicking on the link

        Actions a = new Actions(driver);

        WebElement source = driver.findElement(By.linkText("compendiumdev"));

        a.moveToElement(source).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

        Thread.sleep(2000);
        driver.quit();

    }

}
