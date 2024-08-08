package com.automationteststore.testCases.Demos.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_59_sendKeysCommandOfAlertInterface_Command {

    @Test(enabled = true)
    public void f1() throws Exception {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("http://omayo.blogspot.com/");

        driver.findElement(By.id("prompt")).click();

        //alert.sendKeys command is used to enter the value in alert textBox popUp
        //if Selenium will perform any action without coming alert it will throw exception alert
        Alert alert = driver.switchTo().alert();

        Thread.sleep(2000);
        alert.sendKeys("Arun"); //It will enter the value in alert text box


        Thread.sleep(5000);
        alert.accept();  //It will accept the alert popup

        //alert.dismiss(); //It will dismiss the alert popup

        Thread.sleep(2000);
        driver.quit();

    }

}
