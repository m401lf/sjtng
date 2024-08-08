package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Video_36_getWindowHandle_getWindowHandles_switchTo_window_Command {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getWindowHandle() command is used to capture the parent window name
        // The purpose getWindowHandles() command is used to capture all the window names during that selenium execution session
        // The purpose switchTo() command is used to switch to a specific window
        // The purpose window() command is used to identified to switch a specific window

        String parentWindow = driver.getWindowHandle();
        driver.findElement(By.linkText("Open a popup window")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> itr = windows.iterator();

        while (itr.hasNext()) {
            String window = itr.next();
            driver.switchTo().window(window);
            if (driver.getTitle().equals("Basic Web Page Title")) {
                Thread.sleep(1000);
                driver.close();
            }
        }

        //It will return back to parent/first window
        driver.switchTo().window(parentWindow);
        driver.findElement(By.name("q")).sendKeys("123445");


        Thread.sleep(2000);
        driver.quit();

    }

}
