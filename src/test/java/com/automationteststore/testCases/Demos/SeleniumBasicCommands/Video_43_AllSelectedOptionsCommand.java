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

import java.util.List;

public class Video_43_AllSelectedOptionsCommand {

    @Test(enabled = true)
    public void f1() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/");

        // The purpose getAllSelectedOptions() command is used to return all the selected value from MultiSelect webElement from the webPage

        //MultiSelect Example
        WebElement multiSelect = driver.findElement(By.id("multiselect1"));
        Select select2 = new Select(multiSelect);

        select2.selectByVisibleText("Volvo");
        select2.selectByVisibleText("Swift");
        select2.selectByVisibleText("Hyundai");
        select2.selectByVisibleText("Audi");

        List<WebElement> multiselectedItems = select2.getAllSelectedOptions();
        System.out.println(multiselectedItems.size());

        for (WebElement item : multiselectedItems) {
            System.out.println(item.getText());
        }

        Thread.sleep(2000);
        driver.quit();

    }

}
