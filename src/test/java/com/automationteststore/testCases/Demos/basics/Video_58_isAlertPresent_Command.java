package com.automationteststore.testCases.Demos.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.time.Duration;

public class Video_58_isAlertPresent_Command {

    @Test(enabled = true)
    public void f1() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://omayo.blogspot.com/");

        driver.findElement(By.id("alert1")).click();

        //alertIsPresent() command is used to handle wait for the alert for a given specific time
        //if selenium will perform any action without coming alert it will throw exception alert
        Alert alert = driver.switchTo().alert();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.alertIsPresent());

        String textOfAlert = alert.getText();
        System.out.println(textOfAlert);

        Thread.sleep(2000);
        alert.accept();  //It will accept the alert popup

        //alert.dismiss(); //It will dismiss the alert popup

        Thread.sleep(2000);
        driver.quit();

    }

}
