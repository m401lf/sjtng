package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

public class Video_55_elementToBeClickableCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //The purpose of until() and elementToBeClickable() is wait for click a specific element on the page to given a specific time, if the element will be find before the given specific time
        //It will move to next line it does not wait till that time over like Thread.sleep(2000).
        //It is not a global wait function
        //It is a element specific wait
        driver.get("http://omayo.blogspot.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Check this']")).click();

        WebElement mrOptionCheckBox = driver.findElement(By.id("dte"));
        wait.until(ExpectedConditions.elementToBeClickable(mrOptionCheckBox));
        mrOptionCheckBox.click();

        Thread.sleep(2000);
        driver.quit();

    }

}
