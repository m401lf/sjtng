package com.automationteststore.testCases.Demos.SeleniumBasicCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Video_47_deSelectAllCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose deselectAll() command is used to unselect all the selected value from MultiSelect webElement from the webPage

        //MultiSelect Example
        WebElement multiSelect = driver.findElement(By.id("multiselect1"));
        Select select2 = new Select(multiSelect);

        select2.selectByVisibleText("Volvo");
        select2.selectByVisibleText("Swift");
        select2.selectByVisibleText("Hyundai");
        select2.selectByVisibleText("Audi");

        Thread.sleep(2000);
        select2.deselectAll();

        Thread.sleep(2000);
        driver.quit();

    }

}
