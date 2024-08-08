package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_11_LinkTextLocatorCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose of linkTest() is to find the link of UI element from the webpage
        // It does not have any id attribute or others and it's tag name is start with
        // <a> and closed with </a> anchor tagcompendiumdev
        driver.findElement(By.linkText("compendiumdev")).click();

        Thread.sleep(2000);
        driver.quit();

    }

}
