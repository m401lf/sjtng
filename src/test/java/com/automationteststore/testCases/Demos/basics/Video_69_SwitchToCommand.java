package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Iterator;

public class Video_69_SwitchToCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        //switchTo() command to use for switching the Alert, windows and Frame

        //Switch to alert
        driver.findElement(By.id("alert1")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());

        Thread.sleep(2000);

        //switch to frame
        driver.switchTo().frame("iframe2");
        driver.switchTo().defaultContent();

        //switch to window

        driver.findElement(By.linkText("Open a popup window")).click();
        Iterator<String> itr = driver.getWindowHandles().iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();

        driver.switchTo().window(childWindow); //switch to child window
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindow); //switch to parent window

        Thread.sleep(2000);
        driver.quit();

    }

}
